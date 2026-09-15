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
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;
public final class h5 extends xa {
    public final jc f939x0;
    public final org.telegram.ui.ActionBar.e6 f940y0;
    public final f6 f941z0;

    public h5(f6 f6Var, Context context, d dVar, jc jcVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, dVar);
        this.f941z0 = f6Var;
        this.f939x0 = jcVar;
        this.f940y0 = e6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.x5 x5Var) {
        if (x5Var != null) {
            f6 f6Var = this.f941z0;
            if (f6Var.Q1 != null) {
                TLRPC.Document document = x5Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.o5.f(f6Var.C2, x5Var.documentId);
                }
                if (document != null) {
                    a5 a5Var = f6Var.f798c1;
                    org.telegram.ui.ActionBar.e6 e6Var = this.f940y0;
                    org.telegram.ui.Components.oc h = new vc(a5Var, e6Var).h(document, 2, new d5(this, this.f939x0, e6Var, 0));
                    if (h != null) {
                        h.f26748a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof p51;
        jc jcVar = this.f939x0;
        f6 f6Var = this.f941z0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(f6Var.C2).getUser(Utilities.parseLong(((p51) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(f6Var.C2).openChatOrProfileWith(user, null, jcVar.f1075f, 0, false);
            }
        } else if (characterStyle instanceof m51) {
            String url = ((m51) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    jcVar.H(new b40(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                jcVar.H(new ba0(bundle, null));
                return;
            }
            String b10 = nf.f.b(url);
            if (b10 != null) {
                String lowerCase = b10.toLowerCase();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(f6Var.C2).openByUserName(lowerCase, jcVar.f1075f, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof o51);
        } else if (characterStyle instanceof l51) {
            l51 l51Var = (l51) characterStyle;
            AndroidUtilities.addToClipboard(l51Var.f25835a.subSequence(l51Var.f25836b, l51Var.f25837c).toString());
            wl.o(R.string.TextCopied, new vc(f6Var.f798c1, this.f940y0));
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f940y0;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, e6Var, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        f3Var.multipleLinesTitle = true;
        f6 f6Var = this.f941z0;
        d6 d6Var = f6Var.O1;
        CharSequence[] charSequenceArr = (d6Var == null || d6Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.e6 e6Var2 = this.f940y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                h5 h5Var = h5.this;
                if (i10 == 0) {
                    h5Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new vc(h5Var.f941z0.f798c1, e6Var2).k(false).j();
                }
            }
        };
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = onClickListener;
        f3Var.setOnHideListener(new g5(dVar, 0));
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18907h5, e6Var));
        ((ac) f6Var.Q1).h(f3Var);
    }

    @Override
    public final void I(sa saVar) {
        if (saVar == null) {
            return;
        }
        final TLRPC.Document document = saVar.f1512g;
        f6 f6Var = this.f941z0;
        jc jcVar = this.f939x0;
        final org.telegram.ui.ActionBar.e6 e6Var = this.f940y0;
        if (document != null) {
            n70 F = n70.F(jcVar.v, e6Var, f6Var.K0);
            F.f26350i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) {
                public final h5 f575b;

                {
                    this.f575b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            f6 f6Var2 = this.f575b.f941z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(f6Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(f6Var2.C2).getClientUserId();
                            d6 d6Var = f6Var2.O1;
                            if (d6Var != null) {
                                storyItem = d6Var.f701a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new vc(f6Var2.f798c1, e6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new f(25))).k(true);
                            return;
                        default:
                            f6 f6Var3 = this.f575b.f941z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f18140id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f18124id = document2.f18118id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(f6Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(f6Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new vc(f6Var3.f798c1, e6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) {
                public final h5 f575b;

                {
                    this.f575b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            f6 f6Var2 = this.f575b.f941z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(f6Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(f6Var2.C2).getClientUserId();
                            d6 d6Var = f6Var2.O1;
                            if (d6Var != null) {
                                storyItem = d6Var.f701a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new vc(f6Var2.f798c1, e6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new f(25))).k(true);
                            return;
                        default:
                            f6 f6Var3 = this.f575b.f941z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f18140id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f18124id = document2.f18118id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(f6Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(f6Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new vc(f6Var3.f798c1, e6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (saVar.e && saVar.f1509b != null && saVar.d != null) {
            Bundle bundle = new Bundle();
            if (saVar.f1509b.longValue() >= 0) {
                bundle.putLong("user_id", saVar.f1509b.longValue());
            } else {
                bundle.putLong("chat_id", -saVar.f1509b.longValue());
            }
            bundle.putInt("message_id", saVar.d.intValue());
            jcVar.H(new bo(bundle));
        } else if (saVar.f1509b != null && saVar.f1510c != null) {
            MessagesController.getInstance(f6Var.C2).getStoriesController().d0(saVar.f1509b.longValue(), saVar.f1510c.intValue(), new c5(this, saVar, jcVar, e6Var, 0));
        } else {
            org.telegram.ui.Components.oc Q = new vc(f6Var.f798c1, e6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
            Q.f26748a = 3;
            Q.k(true);
        }
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        boolean z11;
        o01 o01Var;
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
        jc jcVar = this.f939x0;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                org.telegram.ui.Components.c5.r0(jcVar.f1075f, str, true, true, false, false, null, null, this.f940y0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof o51) && (o01Var = ((o51) characterStyle).f26698a) != null && (o01Var.f26643a & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.c5.r0(jcVar.f1075f, str, true, true, true, z11, null, null, this.f940y0);
    }
}
