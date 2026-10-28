package di;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import bi.cb;
import java.net.URLDecoder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Components.z11;
import org.telegram.ui.wn;
public final class u3 extends p8 {
    public final y9 f9227x0;
    public final org.telegram.ui.ActionBar.u6 f9228y0;
    public final q4 f9229z0;

    public u3(q4 q4Var, Context context, b bVar, y9 y9Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, bVar);
        this.f9229z0 = q4Var;
        this.f9227x0 = y9Var;
        this.f9228y0 = u6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.c6 c6Var) {
        if (c6Var != null) {
            q4 q4Var = this.f9229z0;
            if (q4Var.F1 != null) {
                TLRPC.Document document = c6Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.t5.f(q4Var.f9020r2, c6Var.documentId);
                }
                if (document != null) {
                    q3 q3Var = q4Var.R0;
                    org.telegram.ui.ActionBar.u6 u6Var = this.f9228y0;
                    qc h = new wc(q3Var, u6Var).h(document, 2, new bi.v3(this, this.f9227x0, u6Var, 1));
                    if (h != null) {
                        h.f31855a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof b71;
        y9 y9Var = this.f9227x0;
        q4 q4Var = this.f9229z0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(q4Var.f9020r2).getUser(Utilities.parseLong(((b71) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(q4Var.f9020r2).openChatOrProfileWith(user, null, y9Var.f9428f, 0, false);
            }
        } else if (characterStyle instanceof y61) {
            String url = ((y61) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    y9Var.I(new m40(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                y9Var.I(new ua0(bundle, null));
                return;
            }
            String b10 = qf.d.b(url);
            if (b10 != null) {
                String lowerCase = b10.toLowerCase();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(q4Var.f9020r2).openByUserName(lowerCase, y9Var.f9428f, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof a71);
        } else if (characterStyle instanceof x61) {
            x61 x61Var = (x61) characterStyle;
            AndroidUtilities.addToClipboard(x61Var.f34689a.subSequence(x61Var.f34690b, x61Var.f34691c).toString());
            wh.m(R.string.TextCopied, new wc(q4Var.R0, this.f9228y0));
        } else if (characterStyle instanceof ClickableSpan) {
            ((ClickableSpan) characterStyle).onClick(view);
        }
    }

    @Override
    public final void H(final URLSpan uRLSpan, final View view, bi.u6 u6Var) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = qf.d.u(parse, null, null, qf.d.a(parse.getHost()), null);
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
            str = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e10) {
            FileLog.e(e10);
            str = url2;
        }
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.u6 u6Var2 = this.f9228y0;
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, context, u6Var2, false);
        k3Var.fixNavigationBar();
        k3Var.title = str;
        k3Var.bigTitle = false;
        k3Var.multipleLinesTitle = true;
        q4 q4Var = this.f9229z0;
        o4 o4Var = q4Var.D1;
        CharSequence[] charSequenceArr = (o4Var == null || o4Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.u6 u6Var3 = this.f9228y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                u3 u3Var = u3.this;
                if (i10 == 0) {
                    u3Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new wc(u3Var.f9229z0.R0, u6Var3).k(false).j();
                }
            }
        };
        k3Var.items = charSequenceArr;
        k3Var.onClickListener = onClickListener;
        k3Var.setOnHideListener(new cb(u6Var, 3));
        k3Var.fixNavigationBar(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23428h5, u6Var2));
        ((p9) q4Var.F1).h(k3Var);
    }

    @Override
    public final void I(k8 k8Var) {
        if (k8Var == null) {
            return;
        }
        final TLRPC.Document document = k8Var.f8731g;
        q4 q4Var = this.f9229z0;
        y9 y9Var = this.f9227x0;
        final org.telegram.ui.ActionBar.u6 u6Var = this.f9228y0;
        if (document != null) {
            l80 F = l80.F(y9Var.v, u6Var, q4Var.f9049z0);
            F.f30150i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) {
                public final u3 f9114b;

                {
                    this.f9114b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            q4 q4Var2 = this.f9114b.f9229z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(q4Var2.f9020r2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(q4Var2.f9020r2).getClientUserId();
                            o4 o4Var = q4Var2.D1;
                            if (o4Var != null) {
                                storyItem = o4Var.f8870a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new wc(q4Var2.R0, u6Var).R(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new org.telegram.ui.Components.k5(2))).k(true);
                            return;
                        default:
                            q4 q4Var3 = this.f9114b.f9229z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f22056id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f22040id = document2.f22034id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(q4Var3.f9020r2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(q4Var3.f9020r2).sendRequest(tL_account_saveMusic, null);
                            new wc(q4Var3.R0, u6Var).R(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) {
                public final u3 f9114b;

                {
                    this.f9114b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            q4 q4Var2 = this.f9114b.f9229z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(q4Var2.f9020r2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(q4Var2.f9020r2).getClientUserId();
                            o4 o4Var = q4Var2.D1;
                            if (o4Var != null) {
                                storyItem = o4Var.f8870a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new wc(q4Var2.R0, u6Var).R(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new org.telegram.ui.Components.k5(2))).k(true);
                            return;
                        default:
                            q4 q4Var3 = this.f9114b.f9229z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f22056id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f22040id = document2.f22034id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(q4Var3.f9020r2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(q4Var3.f9020r2).sendRequest(tL_account_saveMusic, null);
                            new wc(q4Var3.R0, u6Var).R(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (k8Var.e && k8Var.f8728b != null && k8Var.d != null) {
            Bundle bundle = new Bundle();
            if (k8Var.f8728b.longValue() >= 0) {
                bundle.putLong("user_id", k8Var.f8728b.longValue());
            } else {
                bundle.putLong("chat_id", -k8Var.f8728b.longValue());
            }
            bundle.putInt("message_id", k8Var.d.intValue());
            y9Var.I(new wn(bundle));
        } else if (k8Var.f8728b != null && k8Var.f8729c != null) {
            MessagesController.getInstance(q4Var.f9020r2).getStoriesController().g0(k8Var.f8728b.longValue(), k8Var.f8729c.intValue(), new y2(this, k8Var, y9Var, u6Var, 1));
        } else {
            qc R = new wc(q4Var.R0, u6Var).R(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
            R.f31855a = 3;
            R.k(true);
        }
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        boolean z11;
        z11 z11Var;
        if (!z10 && !AndroidUtilities.shouldShowUrlInAlert(str)) {
            if (i10 == 0) {
                qf.d.p(getContext(), Uri.parse(str), true, true, null);
                return;
            } else if (i10 == 1) {
                qf.d.p(getContext(), Uri.parse(str), false, false, null);
                return;
            } else if (i10 == 2) {
                qf.d.p(getContext(), Uri.parse(str), false, true, null);
                return;
            } else {
                return;
            }
        }
        y9 y9Var = this.f9227x0;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                org.telegram.ui.Components.g5.q0(y9Var.f9428f, str, true, true, false, false, null, null, this.f9228y0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof a71) && (z11Var = ((a71) characterStyle).f26450a) != null && (z11Var.f35208a & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.g5.q0(y9Var.f9428f, str, true, true, true, z11, null, null, this.f9228y0);
    }
}
