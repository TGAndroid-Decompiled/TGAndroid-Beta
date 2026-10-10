package ai;

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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.x61;
import org.telegram.ui.zn;
public final class h5 extends ya {
    public final kc f1084x0;
    public final org.telegram.ui.ActionBar.e6 f1085y0;
    public final f6 f1086z0;

    public h5(f6 f6Var, Context context, d dVar, kc kcVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, dVar);
        this.f1086z0 = f6Var;
        this.f1084x0 = kcVar;
        this.f1085y0 = e6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.b6 b6Var) {
        if (b6Var != null) {
            f6 f6Var = this.f1086z0;
            if (f6Var.Q1 != null) {
                TLRPC.Document document = b6Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.s5.f(f6Var.C2, b6Var.documentId);
                }
                if (document != null) {
                    b5 b5Var = f6Var.f955c1;
                    org.telegram.ui.ActionBar.e6 e6Var = this.f1085y0;
                    org.telegram.ui.Components.tc h = new ad(b5Var, e6Var).h(document, 2, new d5(this, this.f1084x0, e6Var, 0));
                    if (h != null) {
                        h.f31089a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof x61;
        kc kcVar = this.f1084x0;
        f6 f6Var = this.f1086z0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(f6Var.C2).getUser(Utilities.parseLong(((x61) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(f6Var.C2).openChatOrProfileWith(user, null, kcVar.f1267f, 0, false);
            }
        } else if (characterStyle instanceof u61) {
            String url = ((u61) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    kcVar.H(new t40(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                kcVar.H(new eb0(bundle, null));
                return;
            }
            String b10 = of.f.b(url);
            if (b10 != null) {
                String lowerCase = b10.toLowerCase();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(f6Var.C2).openByUserName(lowerCase, kcVar.f1267f, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof w61);
        } else if (characterStyle instanceof t61) {
            t61 t61Var = (t61) characterStyle;
            AndroidUtilities.addToClipboard(t61Var.f31033a.subSequence(t61Var.f31034b, t61Var.f31035c).toString());
            bi.p(R.string.TextCopied, new ad(f6Var.f955c1, this.f1085y0));
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
                url2 = of.f.v(parse, null, null, of.f.a(parse.getHost()), null);
            } catch (Exception e7) {
                FileLog.e((Throwable) e7, false);
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f1085y0;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, e6Var, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        f3Var.multipleLinesTitle = true;
        f6 f6Var = this.f1086z0;
        d6 d6Var = f6Var.O1;
        CharSequence[] charSequenceArr = (d6Var == null || d6Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.e6 e6Var2 = this.f1085y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                h5 h5Var = h5.this;
                if (i10 == 0) {
                    h5Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new ad(h5Var.f1086z0.f955c1, e6Var2).k(false).j();
                }
            }
        };
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = onClickListener;
        f3Var.setOnHideListener(new g5(dVar, 0));
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20872h5, e6Var));
        ((bc) f6Var.Q1).h(f3Var);
    }

    @Override
    public final void I(ta taVar) {
        if (taVar == null) {
            return;
        }
        final TLRPC.Document document = taVar.f1758g;
        f6 f6Var = this.f1086z0;
        kc kcVar = this.f1084x0;
        final org.telegram.ui.ActionBar.e6 e6Var = this.f1085y0;
        if (document != null) {
            q80 F = q80.F(kcVar.v, e6Var, f6Var.K0);
            F.f30102i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) {
                public final h5 f757b;

                {
                    this.f757b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            f6 f6Var2 = this.f757b.f1086z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(f6Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(f6Var2.C2).getClientUserId();
                            d6 d6Var = f6Var2.O1;
                            if (d6Var != null) {
                                storyItem = d6Var.f822a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new ad(f6Var2.f955c1, e6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new f(25))).k(true);
                            return;
                        default:
                            f6 f6Var3 = this.f757b.f1086z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f20070id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f20054id = document2.f20048id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(f6Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(f6Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new ad(f6Var3.f955c1, e6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) {
                public final h5 f757b;

                {
                    this.f757b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            f6 f6Var2 = this.f757b.f1086z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(f6Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(f6Var2.C2).getClientUserId();
                            d6 d6Var = f6Var2.O1;
                            if (d6Var != null) {
                                storyItem = d6Var.f822a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new ad(f6Var2.f955c1, e6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new f(25))).k(true);
                            return;
                        default:
                            f6 f6Var3 = this.f757b.f1086z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f20070id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f20054id = document2.f20048id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(f6Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(f6Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new ad(f6Var3.f955c1, e6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (taVar.f1756e && taVar.f1754b != null && taVar.d != null) {
            Bundle bundle = new Bundle();
            if (taVar.f1754b.longValue() >= 0) {
                bundle.putLong("user_id", taVar.f1754b.longValue());
            } else {
                bundle.putLong("chat_id", -taVar.f1754b.longValue());
            }
            bundle.putInt("message_id", taVar.d.intValue());
            kcVar.H(new zn(bundle));
        } else if (taVar.f1754b != null && taVar.f1755c != null) {
            MessagesController.getInstance(f6Var.C2).getStoriesController().d0(taVar.f1754b.longValue(), taVar.f1755c.intValue(), new f4(this, taVar, kcVar, e6Var, 1));
        } else {
            org.telegram.ui.Components.tc Q = new ad(f6Var.f955c1, e6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
            Q.f31089a = 3;
            Q.k(true);
        }
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        boolean z11;
        u11 u11Var;
        if (!z10 && !AndroidUtilities.shouldShowUrlInAlert(str)) {
            if (i10 == 0) {
                of.f.q(getContext(), Uri.parse(str), true, true, null);
                return;
            } else if (i10 == 1) {
                of.f.q(getContext(), Uri.parse(str), false, false, null);
                return;
            } else if (i10 == 2) {
                of.f.q(getContext(), Uri.parse(str), false, true, null);
                return;
            } else {
                return;
            }
        }
        kc kcVar = this.f1084x0;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                org.telegram.ui.Components.g5.q0(kcVar.f1267f, str, true, true, false, false, null, null, this.f1085y0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof w61) && (u11Var = ((w61) characterStyle).f32608a) != null && (u11Var.f31299a & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.g5.q0(kcVar.f1267f, str, true, true, true, z11, null, null, this.f1085y0);
    }
}
