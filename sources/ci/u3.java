package ci;

import ai.cb;
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
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.sn;
public final class u3 extends r8 {
    public final z9 f5982x0;
    public final org.telegram.ui.ActionBar.g6 f5983y0;
    public final p4 f5984z0;

    public u3(p4 p4Var, Context context, b bVar, z9 z9Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, bVar);
        this.f5984z0 = p4Var;
        this.f5982x0 = z9Var;
        this.f5983y0 = g6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.a6 a6Var) {
        if (a6Var != null) {
            p4 p4Var = this.f5984z0;
            if (p4Var.Q1 != null) {
                TLRPC.Document document = a6Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.r5.f(p4Var.C2, a6Var.documentId);
                }
                if (document != null) {
                    q3 q3Var = p4Var.f5656c1;
                    org.telegram.ui.ActionBar.g6 g6Var = this.f5983y0;
                    qc h = new xc(q3Var, g6Var).h(document, 2, new ai.a4(this, this.f5982x0, g6Var, 1));
                    if (h != null) {
                        h.f29826a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof t61;
        z9 z9Var = this.f5982x0;
        p4 p4Var = this.f5984z0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(p4Var.C2).getUser(Utilities.parseLong(((t61) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(p4Var.C2).openChatOrProfileWith(user, null, z9Var.f6233f, 0, false);
            }
        } else if (characterStyle instanceof q61) {
            String url = ((q61) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    z9Var.H(new k40(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                z9Var.H(new xa0(bundle, null));
                return;
            }
            String b10 = pf.d.b(url);
            if (b10 != null) {
                String lowerCase = b10.toLowerCase();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(p4Var.C2).openByUserName(lowerCase, z9Var.f6233f, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof s61);
        } else if (characterStyle instanceof p61) {
            p61 p61Var = (p61) characterStyle;
            AndroidUtilities.addToClipboard(p61Var.f29459a.subSequence(p61Var.f29460b, p61Var.f29461c).toString());
            sl.p(R.string.TextCopied, new xc(p4Var.f5656c1, this.f5983y0));
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f5983y0;
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, context, g6Var, false);
        h3Var.fixNavigationBar();
        h3Var.title = str;
        h3Var.bigTitle = false;
        h3Var.multipleLinesTitle = true;
        p4 p4Var = this.f5984z0;
        n4 n4Var = p4Var.O1;
        CharSequence[] charSequenceArr = (n4Var == null || n4Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.g6 g6Var2 = this.f5983y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                u3 u3Var = u3.this;
                if (i10 == 0) {
                    u3Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new xc(u3Var.f5984z0.f5656c1, g6Var2).k(false).j();
                }
            }
        };
        h3Var.items = charSequenceArr;
        h3Var.onClickListener = onClickListener;
        h3Var.setOnHideListener(new cb(dVar, 3));
        h3Var.fixNavigationBar(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21254h5, g6Var));
        ((q9) p4Var.Q1).h(h3Var);
    }

    @Override
    public final void I(m8 m8Var) {
        if (m8Var == null) {
            return;
        }
        final TLRPC.Document document = m8Var.f5568g;
        p4 p4Var = this.f5984z0;
        z9 z9Var = this.f5982x0;
        final org.telegram.ui.ActionBar.g6 g6Var = this.f5983y0;
        if (document != null) {
            j80 F = j80.F(z9Var.v, g6Var, p4Var.K0);
            F.f27562i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) {
                public final u3 f5855b;

                {
                    this.f5855b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            p4 p4Var2 = this.f5855b.f5984z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(p4Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(p4Var2.C2).getClientUserId();
                            n4 n4Var = p4Var2.O1;
                            if (n4Var != null) {
                                storyItem = n4Var.f5595a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new xc(p4Var2.f5656c1, g6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new rc(0))).k(true);
                            return;
                        default:
                            p4 p4Var3 = this.f5855b.f5984z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f20371id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f20355id = document2.f20349id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(p4Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(p4Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new xc(p4Var3.f5656c1, g6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) {
                public final u3 f5855b;

                {
                    this.f5855b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            p4 p4Var2 = this.f5855b.f5984z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(p4Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(p4Var2.C2).getClientUserId();
                            n4 n4Var = p4Var2.O1;
                            if (n4Var != null) {
                                storyItem = n4Var.f5595a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new xc(p4Var2.f5656c1, g6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new rc(0))).k(true);
                            return;
                        default:
                            p4 p4Var3 = this.f5855b.f5984z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f20371id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f20355id = document2.f20349id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(p4Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(p4Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new xc(p4Var3.f5656c1, g6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (m8Var.e && m8Var.f5565b != null && m8Var.d != null) {
            Bundle bundle = new Bundle();
            if (m8Var.f5565b.longValue() >= 0) {
                bundle.putLong("user_id", m8Var.f5565b.longValue());
            } else {
                bundle.putLong("chat_id", -m8Var.f5565b.longValue());
            }
            bundle.putInt("message_id", m8Var.d.intValue());
            z9Var.H(new sn(bundle));
        } else if (m8Var.f5565b != null && m8Var.f5566c != null) {
            MessagesController.getInstance(p4Var.C2).getStoriesController().d0(m8Var.f5565b.longValue(), m8Var.f5566c.intValue(), new y2(this, m8Var, z9Var, g6Var, 1));
        } else {
            qc Q = new xc(p4Var.f5656c1, g6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
            Q.f29826a = 3;
            Q.k(true);
        }
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        boolean z11;
        q11 q11Var;
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
        z9 z9Var = this.f5982x0;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                org.telegram.ui.Components.f5.r0(z9Var.f6233f, str, true, true, false, false, null, null, this.f5983y0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof s61) && (q11Var = ((s61) characterStyle).f30392a) != null && (q11Var.f29754a & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.f5.r0(z9Var.f6233f, str, true, true, true, z11, null, null, this.f5983y0);
    }
}
