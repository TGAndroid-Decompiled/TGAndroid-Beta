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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xc;
import org.telegram.ui.zn;
public final class h5 extends xa {
    public final jc f944x0;
    public final org.telegram.ui.ActionBar.e6 f945y0;
    public final f6 f946z0;

    public h5(f6 f6Var, Context context, d dVar, jc jcVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, dVar);
        this.f946z0 = f6Var;
        this.f944x0 = jcVar;
        this.f945y0 = e6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.z5 z5Var) {
        if (z5Var != null) {
            f6 f6Var = this.f946z0;
            if (f6Var.Q1 != null) {
                TLRPC.Document document = z5Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.q5.f(f6Var.C2, z5Var.documentId);
                }
                if (document != null) {
                    a5 a5Var = f6Var.f803c1;
                    org.telegram.ui.ActionBar.e6 e6Var = this.f945y0;
                    org.telegram.ui.Components.qc h = new xc(a5Var, e6Var).h(document, 2, new d5(this, this.f944x0, e6Var, 0));
                    if (h != null) {
                        h.f27544a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof e61;
        jc jcVar = this.f944x0;
        f6 f6Var = this.f946z0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(f6Var.C2).getUser(Utilities.parseLong(((e61) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(f6Var.C2).openChatOrProfileWith(user, null, jcVar.f1080f, 0, false);
            }
        } else if (characterStyle instanceof b61) {
            String url = ((b61) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    jcVar.H(new b40(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                jcVar.H(new ka0(bundle, null));
                return;
            }
            String b10 = nf.f.b(url);
            if (b10 != null) {
                String lowerCase = b10.toLowerCase();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(f6Var.C2).openByUserName(lowerCase, jcVar.f1080f, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof d61);
        } else if (characterStyle instanceof a61) {
            a61 a61Var = (a61) characterStyle;
            AndroidUtilities.addToClipboard(a61Var.f22530a.subSequence(a61Var.f22531b, a61Var.f22532c).toString());
            wh.n(R.string.TextCopied, new xc(f6Var.f803c1, this.f945y0));
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f945y0;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, e6Var, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        f3Var.multipleLinesTitle = true;
        f6 f6Var = this.f946z0;
        d6 d6Var = f6Var.O1;
        CharSequence[] charSequenceArr = (d6Var == null || d6Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.e6 e6Var2 = this.f945y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                h5 h5Var = h5.this;
                if (i10 == 0) {
                    h5Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new xc(h5Var.f946z0.f803c1, e6Var2).k(false).j();
                }
            }
        };
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = onClickListener;
        f3Var.setOnHideListener(new g5(dVar, 0));
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19133h5, e6Var));
        ((ac) f6Var.Q1).h(f3Var);
    }

    @Override
    public final void I(sa saVar) {
        if (saVar == null) {
            return;
        }
        final TLRPC.Document document = saVar.f1517g;
        f6 f6Var = this.f946z0;
        jc jcVar = this.f944x0;
        final org.telegram.ui.ActionBar.e6 e6Var = this.f945y0;
        if (document != null) {
            w70 F = w70.F(jcVar.v, e6Var, f6Var.K0);
            F.f29906i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) {
                public final h5 f580b;

                {
                    this.f580b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            f6 f6Var2 = this.f580b.f946z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(f6Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(f6Var2.C2).getClientUserId();
                            d6 d6Var = f6Var2.O1;
                            if (d6Var != null) {
                                storyItem = d6Var.f706a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new xc(f6Var2.f803c1, e6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new f(25))).k(true);
                            return;
                        default:
                            f6 f6Var3 = this.f580b.f946z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f18324id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f18308id = document2.f18302id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(f6Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(f6Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new xc(f6Var3.f803c1, e6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) {
                public final h5 f580b;

                {
                    this.f580b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            f6 f6Var2 = this.f580b.f946z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(f6Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(f6Var2.C2).getClientUserId();
                            d6 d6Var = f6Var2.O1;
                            if (d6Var != null) {
                                storyItem = d6Var.f706a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new xc(f6Var2.f803c1, e6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new f(25))).k(true);
                            return;
                        default:
                            f6 f6Var3 = this.f580b.f946z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f18324id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f18308id = document2.f18302id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(f6Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(f6Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new xc(f6Var3.f803c1, e6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (saVar.e && saVar.f1514b != null && saVar.d != null) {
            Bundle bundle = new Bundle();
            if (saVar.f1514b.longValue() >= 0) {
                bundle.putLong("user_id", saVar.f1514b.longValue());
            } else {
                bundle.putLong("chat_id", -saVar.f1514b.longValue());
            }
            bundle.putInt("message_id", saVar.d.intValue());
            jcVar.H(new zn(bundle));
        } else if (saVar.f1514b != null && saVar.f1515c != null) {
            MessagesController.getInstance(f6Var.C2).getStoriesController().d0(saVar.f1514b.longValue(), saVar.f1515c.intValue(), new c5(this, saVar, jcVar, e6Var, 0));
        } else {
            org.telegram.ui.Components.qc Q = new xc(f6Var.f803c1, e6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
            Q.f27544a = 3;
            Q.k(true);
        }
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        boolean z11;
        d11 d11Var;
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
        jc jcVar = this.f944x0;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                org.telegram.ui.Components.e5.r0(jcVar.f1080f, str, true, true, false, false, null, null, this.f945y0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof d61) && (d11Var = ((d61) characterStyle).f23464a) != null && (d11Var.f23395a & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.e5.r0(jcVar.f1080f, str, true, true, true, z11, null, null, this.f945y0);
    }
}
