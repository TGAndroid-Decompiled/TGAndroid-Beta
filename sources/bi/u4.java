package bi;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
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
import org.telegram.messenger.yh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
public final class u4 extends ha {
    public final sb f3781x0;
    public final org.telegram.ui.ActionBar.c6 f3782y0;
    public final q5 f3783z0;

    public u4(q5 q5Var, Context context, b bVar, sb sbVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, bVar);
        this.f3783z0 = q5Var;
        this.f3781x0 = sbVar;
        this.f3782y0 = c6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.b6 b6Var) {
        if (b6Var != null) {
            q5 q5Var = this.f3783z0;
            if (q5Var.Q1 != null) {
                TLRPC.Document document = b6Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.s5.f(q5Var.C2, b6Var.documentId);
                }
                if (document != null) {
                    o4 o4Var = q5Var.f3511c1;
                    org.telegram.ui.ActionBar.c6 c6Var = this.f3782y0;
                    sc h = new zc(o4Var, c6Var).h(document, 2, new q4(this, this.f3781x0, c6Var, 0));
                    if (h != null) {
                        h.f29096a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof s61;
        sb sbVar = this.f3781x0;
        q5 q5Var = this.f3783z0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(q5Var.C2).getUser(Utilities.parseLong(((s61) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(q5Var.C2).openChatOrProfileWith(user, null, sbVar.f3673f, 0, false);
            }
        } else if (characterStyle instanceof p61) {
            String url = ((p61) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    sbVar.H(new o40(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                sbVar.H(new cb0(bundle, null));
                return;
            }
            String b10 = pf.d.b(url);
            if (b10 != null) {
                String lowerCase = b10.toLowerCase();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(q5Var.C2).openByUserName(lowerCase, sbVar.f3673f, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof r61);
        } else if (characterStyle instanceof o61) {
            o61 o61Var = (o61) characterStyle;
            AndroidUtilities.addToClipboard(o61Var.f27892a.subSequence(o61Var.f27893b, o61Var.f27894c).toString());
            yh.o(R.string.TextCopied, new zc(q5Var.f3511c1, this.f3782y0));
        } else if (characterStyle instanceof ClickableSpan) {
            ((ClickableSpan) characterStyle).onClick(view);
        }
    }

    @Override
    public final void H(final URLSpan uRLSpan, final View view, a3.d dVar) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = pf.d.v(parse, null, null, pf.d.a(parse.getHost()), null);
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
            str = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e7) {
            FileLog.e(e7);
            str = url2;
        }
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.c6 c6Var = this.f3782y0;
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, context, c6Var, false);
        e3Var.fixNavigationBar();
        e3Var.title = str;
        e3Var.bigTitle = false;
        e3Var.multipleLinesTitle = true;
        q5 q5Var = this.f3783z0;
        o5 o5Var = q5Var.O1;
        CharSequence[] charSequenceArr = (o5Var == null || o5Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.c6 c6Var2 = this.f3782y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                u4 u4Var = u4.this;
                if (i10 == 0) {
                    u4Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new zc(u4Var.f3783z0.f3511c1, c6Var2).k(false).j();
                }
            }
        };
        e3Var.items = charSequenceArr;
        e3Var.onClickListener = onClickListener;
        e3Var.setOnHideListener(new t4(dVar, 0));
        e3Var.fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, c6Var));
        ((jb) q5Var.Q1).h(e3Var);
    }

    @Override
    public final void I(ca caVar) {
        if (caVar == null) {
            return;
        }
        final TLRPC.Document document = caVar.f2919g;
        q5 q5Var = this.f3783z0;
        sb sbVar = this.f3781x0;
        final org.telegram.ui.ActionBar.c6 c6Var = this.f3782y0;
        if (document != null) {
            m80 F = m80.F(sbVar.v, c6Var, q5Var.K0);
            F.f27280i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) {
                public final u4 f3462b;

                {
                    this.f3462b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            q5 q5Var2 = this.f3462b.f3783z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(q5Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(q5Var2.C2).getClientUserId();
                            o5 o5Var = q5Var2.O1;
                            if (o5Var != null) {
                                storyItem = o5Var.f3413a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new zc(q5Var2.f3511c1, c6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new ah.j(26))).k(true);
                            return;
                        default:
                            q5 q5Var3 = this.f3462b.f3783z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f19244id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f19228id = document2.f19222id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(q5Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(q5Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new zc(q5Var3.f3511c1, c6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) {
                public final u4 f3462b;

                {
                    this.f3462b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            q5 q5Var2 = this.f3462b.f3783z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(q5Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(q5Var2.C2).getClientUserId();
                            o5 o5Var = q5Var2.O1;
                            if (o5Var != null) {
                                storyItem = o5Var.f3413a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new zc(q5Var2.f3511c1, c6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new ah.j(26))).k(true);
                            return;
                        default:
                            q5 q5Var3 = this.f3462b.f3783z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f19244id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f19228id = document2.f19222id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(q5Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(q5Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new zc(q5Var3.f3511c1, c6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (caVar.e && caVar.f2916b != null && caVar.d != null) {
            Bundle bundle = new Bundle();
            if (caVar.f2916b.longValue() >= 0) {
                bundle.putLong("user_id", caVar.f2916b.longValue());
            } else {
                bundle.putLong("chat_id", -caVar.f2916b.longValue());
            }
            bundle.putInt("message_id", caVar.d.intValue());
            sbVar.H(new fo(bundle));
        } else if (caVar.f2916b != null && caVar.f2917c != null) {
            MessagesController.getInstance(q5Var.C2).getStoriesController().d0(caVar.f2916b.longValue(), caVar.f2917c.intValue(), new u3(this, caVar, sbVar, c6Var, 1));
        } else {
            sc Q = new zc(q5Var.f3511c1, c6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
            Q.f29096a = 3;
            Q.k(true);
        }
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        boolean z11;
        p11 p11Var;
        if (!z10 && !AndroidUtilities.shouldShowUrlInAlert(str)) {
            if (i10 == 0) {
                pf.d.q(getContext(), Uri.parse(str), true, true, null);
                return;
            } else if (i10 == 1) {
                pf.d.q(getContext(), Uri.parse(str), false, false, null);
                return;
            } else if (i10 == 2) {
                pf.d.q(getContext(), Uri.parse(str), false, true, null);
                return;
            } else {
                return;
            }
        }
        sb sbVar = this.f3781x0;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                org.telegram.ui.Components.g5.q0(sbVar.f3673f, str, true, true, false, false, null, null, this.f3782y0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof r61) && (p11Var = ((r61) characterStyle).f28770a) != null && (p11Var.f28135a & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.g5.q0(sbVar.f3673f, str, true, true, true, z11, null, null, this.f3782y0);
    }
}
