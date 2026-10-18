package ci;

import ai.bb;
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
import org.telegram.messenger.kk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.sn;
public final class v3 extends s8 {
    public final aa f6078x0;
    public final org.telegram.ui.ActionBar.d6 f6079y0;
    public final q4 f6080z0;

    public v3(q4 q4Var, Context context, b bVar, aa aaVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, bVar);
        this.f6080z0 = q4Var;
        this.f6078x0 = aaVar;
        this.f6079y0 = d6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.a6 a6Var) {
        if (a6Var != null) {
            q4 q4Var = this.f6080z0;
            if (q4Var.Q1 != null) {
                TLRPC.Document document = a6Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.r5.f(q4Var.C2, a6Var.documentId);
                }
                if (document != null) {
                    r3 r3Var = q4Var.f5772c1;
                    org.telegram.ui.ActionBar.d6 d6Var = this.f6079y0;
                    qc h = new xc(r3Var, d6Var).h(document, 2, new ai.w3(this, this.f6078x0, d6Var, 1));
                    if (h != null) {
                        h.f29639a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof m61;
        aa aaVar = this.f6078x0;
        q4 q4Var = this.f6080z0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(q4Var.C2).getUser(Utilities.parseLong(((m61) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(q4Var.C2).openChatOrProfileWith(user, null, aaVar.f5190f, 0, false);
            }
        } else if (characterStyle instanceof j61) {
            String url = ((j61) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    aaVar.H(new k40(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                aaVar.H(new wa0(bundle, null));
                return;
            }
            String b10 = pf.d.b(url);
            if (b10 != null) {
                String lowerCase = b10.toLowerCase();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(q4Var.C2).openByUserName(lowerCase, aaVar.f5190f, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof l61);
        } else if (characterStyle instanceof i61) {
            i61 i61Var = (i61) characterStyle;
            AndroidUtilities.addToClipboard(i61Var.f27096a.subSequence(i61Var.f27097b, i61Var.f27098c).toString());
            kk.p(R.string.TextCopied, new xc(q4Var.f5772c1, this.f6079y0));
        } else if (characterStyle instanceof ClickableSpan) {
            ((ClickableSpan) characterStyle).onClick(view);
        }
    }

    @Override
    public final void H(final URLSpan uRLSpan, final View view, androidx.fragment.app.d dVar) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = pf.d.u(parse, null, null, pf.d.a(parse.getHost()), null);
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
        org.telegram.ui.ActionBar.d6 d6Var = this.f6079y0;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, d6Var, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        f3Var.multipleLinesTitle = true;
        q4 q4Var = this.f6080z0;
        o4 o4Var = q4Var.O1;
        CharSequence[] charSequenceArr = (o4Var == null || o4Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.d6 d6Var2 = this.f6079y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                v3 v3Var = v3.this;
                if (i10 == 0) {
                    v3Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new xc(v3Var.f6080z0.f5772c1, d6Var2).k(false).j();
                }
            }
        };
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = onClickListener;
        f3Var.setOnHideListener(new bb(dVar, 3));
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21064h5, d6Var));
        ((r9) q4Var.Q1).h(f3Var);
    }

    @Override
    public final void I(n8 n8Var) {
        if (n8Var == null) {
            return;
        }
        final TLRPC.Document document = n8Var.f5665g;
        q4 q4Var = this.f6080z0;
        aa aaVar = this.f6078x0;
        final org.telegram.ui.ActionBar.d6 d6Var = this.f6079y0;
        if (document != null) {
            i80 F = i80.F(aaVar.v, d6Var, q4Var.K0);
            F.f27123i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) {
                public final v3 f5959b;

                {
                    this.f5959b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            q4 q4Var2 = this.f5959b.f6080z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(q4Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(q4Var2.C2).getClientUserId();
                            o4 o4Var = q4Var2.O1;
                            if (o4Var != null) {
                                storyItem = o4Var.f5691a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new xc(q4Var2.f5772c1, d6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new rc(0))).k(true);
                            return;
                        default:
                            q4 q4Var3 = this.f5959b.f6080z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f20307id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f20291id = document2.f20285id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(q4Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(q4Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new xc(q4Var3.f5772c1, d6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) {
                public final v3 f5959b;

                {
                    this.f5959b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            q4 q4Var2 = this.f5959b.f6080z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(q4Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(q4Var2.C2).getClientUserId();
                            o4 o4Var = q4Var2.O1;
                            if (o4Var != null) {
                                storyItem = o4Var.f5691a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new xc(q4Var2.f5772c1, d6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new rc(0))).k(true);
                            return;
                        default:
                            q4 q4Var3 = this.f5959b.f6080z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f20307id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f20291id = document2.f20285id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(q4Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(q4Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new xc(q4Var3.f5772c1, d6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (n8Var.e && n8Var.f5662b != null && n8Var.d != null) {
            Bundle bundle = new Bundle();
            if (n8Var.f5662b.longValue() >= 0) {
                bundle.putLong("user_id", n8Var.f5662b.longValue());
            } else {
                bundle.putLong("chat_id", -n8Var.f5662b.longValue());
            }
            bundle.putInt("message_id", n8Var.d.intValue());
            aaVar.H(new sn(bundle));
        } else if (n8Var.f5662b != null && n8Var.f5663c != null) {
            MessagesController.getInstance(q4Var.C2).getStoriesController().d0(n8Var.f5662b.longValue(), n8Var.f5663c.intValue(), new z2(this, n8Var, aaVar, d6Var, 1));
        } else {
            qc Q = new xc(q4Var.f5772c1, d6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
            Q.f29639a = 3;
            Q.k(true);
        }
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        boolean z11;
        l11 l11Var;
        if (!z10 && !AndroidUtilities.shouldShowUrlInAlert(str)) {
            if (i10 == 0) {
                pf.d.p(getContext(), Uri.parse(str), true, true, null);
                return;
            } else if (i10 == 1) {
                pf.d.p(getContext(), Uri.parse(str), false, false, null);
                return;
            } else if (i10 == 2) {
                pf.d.p(getContext(), Uri.parse(str), false, true, null);
                return;
            } else {
                return;
            }
        }
        aa aaVar = this.f6078x0;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                org.telegram.ui.Components.f5.q0(aaVar.f5190f, str, true, true, false, false, null, null, this.f6079y0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof l61) && (l11Var = ((l61) characterStyle).f28119a) != null && (l11Var.f28056a & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.f5.q0(aaVar.f5190f, str, true, true, true, z11, null, null, this.f6079y0);
    }
}
