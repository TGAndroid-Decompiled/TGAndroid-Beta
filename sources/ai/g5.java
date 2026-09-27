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
import org.telegram.messenger.qk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.xn;
public final class g5 extends xa {
    public final jc f899x0;
    public final org.telegram.ui.ActionBar.e6 f900y0;
    public final e6 f901z0;

    public g5(e6 e6Var, Context context, d dVar, jc jcVar, org.telegram.ui.ActionBar.e6 e6Var2) {
        super(context, dVar);
        this.f901z0 = e6Var;
        this.f899x0 = jcVar;
        this.f900y0 = e6Var2;
    }

    @Override
    public final void F(org.telegram.ui.Components.z5 z5Var) {
        if (z5Var != null) {
            e6 e6Var = this.f901z0;
            if (e6Var.Q1 != null) {
                TLRPC.Document document = z5Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.q5.f(e6Var.C2, z5Var.documentId);
                }
                if (document != null) {
                    a5 a5Var = e6Var.f779c1;
                    org.telegram.ui.ActionBar.e6 e6Var2 = this.f900y0;
                    org.telegram.ui.Components.qc h = new xc(a5Var, e6Var2).h(document, 2, new c5(this, this.f899x0, e6Var2, 0));
                    if (h != null) {
                        h.f27685a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof e61;
        jc jcVar = this.f899x0;
        e6 e6Var = this.f901z0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(e6Var.C2).getUser(Utilities.parseLong(((e61) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(e6Var.C2).openChatOrProfileWith(user, null, jcVar.f1073f, 0, false);
            }
        } else if (characterStyle instanceof b61) {
            String url = ((b61) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    jcVar.H(new e40(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                jcVar.H(new oa0(bundle, null));
                return;
            }
            String b10 = nf.f.b(url);
            if (b10 != null) {
                String lowerCase = b10.toLowerCase();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(e6Var.C2).openByUserName(lowerCase, jcVar.f1073f, 0, null);
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
            AndroidUtilities.addToClipboard(a61Var.f22564a.subSequence(a61Var.f22565b, a61Var.f22566c).toString());
            qk.o(R.string.TextCopied, new xc(e6Var.f779c1, this.f900y0));
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f900y0;
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(1, context, e6Var, false);
        g3Var.fixNavigationBar();
        g3Var.title = str;
        g3Var.bigTitle = false;
        g3Var.multipleLinesTitle = true;
        e6 e6Var2 = this.f901z0;
        c6 c6Var = e6Var2.O1;
        CharSequence[] charSequenceArr = (c6Var == null || c6Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.e6 e6Var3 = this.f900y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                g5 g5Var = g5.this;
                if (i10 == 0) {
                    g5Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new xc(g5Var.f901z0.f779c1, e6Var3).k(false).j();
                }
            }
        };
        g3Var.items = charSequenceArr;
        g3Var.onClickListener = onClickListener;
        g3Var.setOnHideListener(new f5(dVar, 0));
        g3Var.fixNavigationBar(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19128h5, e6Var));
        ((ac) e6Var2.Q1).h(g3Var);
    }

    @Override
    public final void I(sa saVar) {
        if (saVar == null) {
            return;
        }
        final TLRPC.Document document = saVar.f1518g;
        e6 e6Var = this.f901z0;
        jc jcVar = this.f899x0;
        final org.telegram.ui.ActionBar.e6 e6Var2 = this.f900y0;
        if (document != null) {
            a80 F = a80.F(jcVar.v, e6Var2, e6Var.K0);
            F.f22588i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) {
                public final g5 f587b;

                {
                    this.f587b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            e6 e6Var3 = this.f587b.f901z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(e6Var3.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(e6Var3.C2).getClientUserId();
                            c6 c6Var = e6Var3.O1;
                            if (c6Var != null) {
                                storyItem = c6Var.f645a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new xc(e6Var3.f779c1, e6Var2).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new f(25))).k(true);
                            return;
                        default:
                            e6 e6Var4 = this.f587b.f901z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f18357id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f18341id = document2.f18335id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(e6Var4.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(e6Var4.C2).sendRequest(tL_account_saveMusic, null);
                            new xc(e6Var4.f779c1, e6Var2).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) {
                public final g5 f587b;

                {
                    this.f587b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            e6 e6Var3 = this.f587b.f901z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(e6Var3.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(e6Var3.C2).getClientUserId();
                            c6 c6Var = e6Var3.O1;
                            if (c6Var != null) {
                                storyItem = c6Var.f645a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new xc(e6Var3.f779c1, e6Var2).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new f(25))).k(true);
                            return;
                        default:
                            e6 e6Var4 = this.f587b.f901z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f18357id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f18341id = document2.f18335id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(e6Var4.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(e6Var4.C2).sendRequest(tL_account_saveMusic, null);
                            new xc(e6Var4.f779c1, e6Var2).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (saVar.e && saVar.f1515b != null && saVar.d != null) {
            Bundle bundle = new Bundle();
            if (saVar.f1515b.longValue() >= 0) {
                bundle.putLong("user_id", saVar.f1515b.longValue());
            } else {
                bundle.putLong("chat_id", -saVar.f1515b.longValue());
            }
            bundle.putInt("message_id", saVar.d.intValue());
            jcVar.H(new xn(bundle));
        } else if (saVar.f1515b != null && saVar.f1516c != null) {
            MessagesController.getInstance(e6Var.C2).getStoriesController().d0(saVar.f1515b.longValue(), saVar.f1516c.intValue(), new e4(this, saVar, jcVar, e6Var2, 1));
        } else {
            org.telegram.ui.Components.qc Q = new xc(e6Var.f779c1, e6Var2).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
            Q.f27685a = 3;
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
        jc jcVar = this.f899x0;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                org.telegram.ui.Components.e5.r0(jcVar.f1073f, str, true, true, false, false, null, null, this.f900y0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof d61) && (d11Var = ((d61) characterStyle).f23579a) != null && (d11Var.f23485a & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.e5.r0(jcVar.f1073f, str, true, true, true, z11, null, null, this.f900y0);
    }
}
