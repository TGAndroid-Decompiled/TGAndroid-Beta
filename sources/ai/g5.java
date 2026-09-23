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
import org.telegram.messenger.ul;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.c40;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.xc;
import org.telegram.ui.xn;
public final class g5 extends xa {
    public final jc f896x0;
    public final org.telegram.ui.ActionBar.d6 f897y0;
    public final e6 f898z0;

    public g5(e6 e6Var, Context context, d dVar, jc jcVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, dVar);
        this.f898z0 = e6Var;
        this.f896x0 = jcVar;
        this.f897y0 = d6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.z5 z5Var) {
        if (z5Var != null) {
            e6 e6Var = this.f898z0;
            if (e6Var.Q1 != null) {
                TLRPC.Document document = z5Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.q5.f(e6Var.C2, z5Var.documentId);
                }
                if (document != null) {
                    a5 a5Var = e6Var.f776c1;
                    org.telegram.ui.ActionBar.d6 d6Var = this.f897y0;
                    org.telegram.ui.Components.qc h = new xc(a5Var, d6Var).h(document, 2, new c5(this, this.f896x0, d6Var, 0));
                    if (h != null) {
                        h.f27300a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof o51;
        jc jcVar = this.f896x0;
        e6 e6Var = this.f898z0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(e6Var.C2).getUser(Utilities.parseLong(((o51) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(e6Var.C2).openChatOrProfileWith(user, null, jcVar.f1071f, 0, false);
            }
        } else if (characterStyle instanceof l51) {
            String url = ((l51) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    jcVar.H(new c40(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                jcVar.H(new ca0(bundle, null));
                return;
            }
            String b10 = nf.f.b(url);
            if (b10 != null) {
                String lowerCase = b10.toLowerCase();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(e6Var.C2).openByUserName(lowerCase, jcVar.f1071f, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof n51);
        } else if (characterStyle instanceof k51) {
            k51 k51Var = (k51) characterStyle;
            AndroidUtilities.addToClipboard(k51Var.f25518a.subSequence(k51Var.f25519b, k51Var.f25520c).toString());
            ul.p(R.string.TextCopied, new xc(e6Var.f776c1, this.f897y0));
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
                url2 = nf.f.v(parse, null, null, nf.f.a(parse.getHost()), null);
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
        org.telegram.ui.ActionBar.d6 d6Var = this.f897y0;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, d6Var, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        f3Var.multipleLinesTitle = true;
        e6 e6Var = this.f898z0;
        c6 c6Var = e6Var.O1;
        CharSequence[] charSequenceArr = (c6Var == null || c6Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.d6 d6Var2 = this.f897y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                g5 g5Var = g5.this;
                if (i10 == 0) {
                    g5Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new xc(g5Var.f898z0.f776c1, d6Var2).k(false).j();
                }
            }
        };
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = onClickListener;
        f3Var.setOnHideListener(new f5(dVar, 0));
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18859h5, d6Var));
        ((ac) e6Var.Q1).h(f3Var);
    }

    @Override
    public final void I(sa saVar) {
        if (saVar == null) {
            return;
        }
        final TLRPC.Document document = saVar.f1516g;
        e6 e6Var = this.f898z0;
        jc jcVar = this.f896x0;
        final org.telegram.ui.ActionBar.d6 d6Var = this.f897y0;
        if (document != null) {
            o70 F = o70.F(jcVar.v, d6Var, e6Var.K0);
            F.f26651i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) {
                public final g5 f584b;

                {
                    this.f584b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            e6 e6Var2 = this.f584b.f898z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(e6Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(e6Var2.C2).getClientUserId();
                            c6 c6Var = e6Var2.O1;
                            if (c6Var != null) {
                                storyItem = c6Var.f642a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new xc(e6Var2.f776c1, d6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new f(25))).k(true);
                            return;
                        default:
                            e6 e6Var3 = this.f584b.f898z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f18111id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f18095id = document2.f18089id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(e6Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(e6Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new xc(e6Var3.f776c1, d6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) {
                public final g5 f584b;

                {
                    this.f584b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            e6 e6Var2 = this.f584b.f898z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(e6Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(e6Var2.C2).getClientUserId();
                            c6 c6Var = e6Var2.O1;
                            if (c6Var != null) {
                                storyItem = c6Var.f642a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new xc(e6Var2.f776c1, d6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new f(25))).k(true);
                            return;
                        default:
                            e6 e6Var3 = this.f584b.f898z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f18111id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f18095id = document2.f18089id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(e6Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(e6Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new xc(e6Var3.f776c1, d6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (saVar.e && saVar.f1513b != null && saVar.d != null) {
            Bundle bundle = new Bundle();
            if (saVar.f1513b.longValue() >= 0) {
                bundle.putLong("user_id", saVar.f1513b.longValue());
            } else {
                bundle.putLong("chat_id", -saVar.f1513b.longValue());
            }
            bundle.putInt("message_id", saVar.d.intValue());
            jcVar.H(new xn(bundle));
        } else if (saVar.f1513b != null && saVar.f1514c != null) {
            MessagesController.getInstance(e6Var.C2).getStoriesController().d0(saVar.f1513b.longValue(), saVar.f1514c.intValue(), new e4(this, saVar, jcVar, d6Var, 1));
        } else {
            org.telegram.ui.Components.qc Q = new xc(e6Var.f776c1, d6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
            Q.f27300a = 3;
            Q.k(true);
        }
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        boolean z11;
        n01 n01Var;
        if (!z10 && !AndroidUtilities.shouldShowUrlInAlert(str)) {
            if (i10 == 0) {
                nf.f.q(getContext(), Uri.parse(str), true, true, null);
                return;
            } else if (i10 == 1) {
                nf.f.q(getContext(), Uri.parse(str), false, false, null);
                return;
            } else if (i10 == 2) {
                nf.f.q(getContext(), Uri.parse(str), false, true, null);
                return;
            } else {
                return;
            }
        }
        jc jcVar = this.f896x0;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                org.telegram.ui.Components.e5.r0(jcVar.f1071f, str, true, true, false, false, null, null, this.f897y0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof n51) && (n01Var = ((n51) characterStyle).f26349a) != null && (n01Var.f26312a & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.e5.r0(jcVar.f1071f, str, true, true, true, z11, null, null, this.f897y0);
    }
}
