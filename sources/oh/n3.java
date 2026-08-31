package oh;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.f40;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t01;
import org.telegram.ui.xn;
public final class n3 extends a8 {
    public final i9 f17479u0;
    public final org.telegram.ui.ActionBar.g6 f17480v0;
    public final f4 f17481w0;

    public n3(f4 f4Var, Context context, b bVar, i9 i9Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, bVar);
        this.f17481w0 = f4Var;
        this.f17479u0 = i9Var;
        this.f17480v0 = g6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.u5 u5Var) {
        if (u5Var != null) {
            f4 f4Var = this.f17481w0;
            if (f4Var.N1 != null) {
                TLRPC.Document document = u5Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.l5.f(f4Var.f17133z2, u5Var.documentId);
                }
                if (document != null) {
                    j3 j3Var = f4Var.Z0;
                    org.telegram.ui.ActionBar.g6 g6Var = this.f17480v0;
                    ic h = new qc(j3Var, g6Var).h(document, 2, new lh.h(this, this.f17479u0, g6Var, 4));
                    if (h != null) {
                        h.f27738a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z4 = characterStyle instanceof q51;
        i9 i9Var = this.f17479u0;
        f4 f4Var = this.f17481w0;
        if (z4) {
            TLRPC.User user = MessagesController.getInstance(f4Var.f17133z2).getUser(Utilities.parseLong(((q51) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(f4Var.f17133z2).openChatOrProfileWith(user, null, i9Var.f17266f, 0, false);
            }
        } else if (characterStyle instanceof n51) {
            String url = ((n51) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    i9Var.H(new f40(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                i9Var.H(new fa0(bundle, null));
                return;
            }
            String b10 = af.g.b(url);
            if (b10 != null) {
                String lowerCase = b10.toLowerCase();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(f4Var.f17133z2).openByUserName(lowerCase, i9Var.f17266f, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof p51);
        } else if (characterStyle instanceof m51) {
            m51 m51Var = (m51) characterStyle;
            AndroidUtilities.addToClipboard(m51Var.f28941a.subSequence(m51Var.f28942b, m51Var.f28943c).toString());
            org.telegram.ui.b.m(R.string.TextCopied, new qc(f4Var.Z0, this.f17480v0));
        } else if (characterStyle instanceof ClickableSpan) {
            ((ClickableSpan) characterStyle).onClick(view);
        }
    }

    @Override
    public final void H(final URLSpan uRLSpan, final View view, t3 t3Var) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = af.g.v(parse, null, null, af.g.a(parse.getHost()), null);
            } catch (Exception e6) {
                FileLog.e((Throwable) e6, false);
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f17480v0;
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(context, g6Var, false, false);
        h3Var.fixNavigationBar();
        h3Var.title = str;
        h3Var.bigTitle = false;
        h3Var.multipleLinesTitle = true;
        f4 f4Var = this.f17481w0;
        d4 d4Var = f4Var.L1;
        CharSequence[] charSequenceArr = (d4Var == null || d4Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.g6 g6Var2 = this.f17480v0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                n3 n3Var = n3.this;
                if (i10 == 0) {
                    n3Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new qc(n3Var.f17481w0.Z0, g6Var2).k(false).j();
                }
            }
        };
        h3Var.items = charSequenceArr;
        h3Var.onClickListener = onClickListener;
        h3Var.setOnHideListener(new fg.d0(t3Var, 6));
        h3Var.fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, g6Var));
        ((z8) f4Var.N1).h(h3Var);
    }

    @Override
    public final void I(v7 v7Var) {
        if (v7Var == null) {
            return;
        }
        final TLRPC.Document document = v7Var.f17862g;
        f4 f4Var = this.f17481w0;
        i9 i9Var = this.f17479u0;
        final org.telegram.ui.ActionBar.g6 g6Var = this.f17480v0;
        if (document != null) {
            q70 F = q70.F(i9Var.v, g6Var, f4Var.H0);
            F.f30311i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) {
                public final n3 f17348b;

                {
                    this.f17348b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            f4 f4Var2 = this.f17348b.f17481w0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(f4Var2.f17133z2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(f4Var2.f17133z2).getClientUserId();
                            d4 d4Var = f4Var2.L1;
                            if (d4Var != null) {
                                storyItem = d4Var.f16961a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new qc(f4Var2.Z0, g6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new jc(0))).k(true);
                            return;
                        default:
                            f4 f4Var3 = this.f17348b.f17481w0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f20871id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f20855id = document2.f20849id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(f4Var3.f17133z2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(f4Var3.f17133z2).sendRequest(tL_account_saveMusic, null);
                            new qc(f4Var3.Z0, g6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) {
                public final n3 f17348b;

                {
                    this.f17348b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            f4 f4Var2 = this.f17348b.f17481w0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(f4Var2.f17133z2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(f4Var2.f17133z2).getClientUserId();
                            d4 d4Var = f4Var2.L1;
                            if (d4Var != null) {
                                storyItem = d4Var.f16961a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new qc(f4Var2.Z0, g6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new jc(0))).k(true);
                            return;
                        default:
                            f4 f4Var3 = this.f17348b.f17481w0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f20871id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f20855id = document2.f20849id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(f4Var3.f17133z2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(f4Var3.f17133z2).sendRequest(tL_account_saveMusic, null);
                            new qc(f4Var3.Z0, g6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (v7Var.f17860e && v7Var.f17858b != null && v7Var.d != null) {
            Bundle bundle = new Bundle();
            if (v7Var.f17858b.longValue() >= 0) {
                bundle.putLong("user_id", v7Var.f17858b.longValue());
            } else {
                bundle.putLong("chat_id", -v7Var.f17858b.longValue());
            }
            bundle.putInt("message_id", v7Var.d.intValue());
            i9Var.H(new xn(bundle));
        } else if (v7Var.f17858b != null && v7Var.f17859c != null) {
            MessagesController.getInstance(f4Var.f17133z2).getStoriesController().d0(v7Var.f17858b.longValue(), v7Var.f17859c.intValue(), new hg.n1(this, v7Var, i9Var, g6Var, 1));
        } else {
            ic Q = new qc(f4Var.Z0, g6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
            Q.f27738a = 3;
            Q.k(true);
        }
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z4) {
        boolean z10;
        t01 t01Var;
        if (!z4 && !AndroidUtilities.shouldShowUrlInAlert(str)) {
            if (i10 == 0) {
                af.g.q(getContext(), Uri.parse(str), true, true, null);
                return;
            } else if (i10 == 1) {
                af.g.q(getContext(), Uri.parse(str), false, false, null);
                return;
            } else if (i10 == 2) {
                af.g.q(getContext(), Uri.parse(str), false, true, null);
                return;
            } else {
                return;
            }
        }
        i9 i9Var = this.f17479u0;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                org.telegram.ui.Components.z4.r0(i9Var.f17266f, str, true, true, false, false, null, null, this.f17480v0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof p51) && (t01Var = ((p51) characterStyle).f29971a) != null && (t01Var.f31225a & 1024) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.z4.r0(i9Var.f17266f, str, true, true, true, z10, null, null, this.f17480v0);
    }
}
