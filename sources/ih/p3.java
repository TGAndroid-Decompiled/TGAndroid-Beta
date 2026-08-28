package ih;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.l30;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.vz0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.qn;
public final class p3 extends e8 {
    public final m9 f11944t0;
    public final org.telegram.ui.ActionBar.b6 f11945u0;
    public final i4 f11946v0;

    public p3(i4 i4Var, Context context, b bVar, m9 m9Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, bVar);
        this.f11946v0 = i4Var;
        this.f11944t0 = m9Var;
        this.f11945u0 = b6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.t5 t5Var) {
        if (t5Var != null) {
            i4 i4Var = this.f11946v0;
            if (i4Var.M1 != null) {
                TLRPC.Document document = t5Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.k5.f(i4Var.f11609y2, t5Var.documentId);
                }
                if (document != null) {
                    l3 l3Var = i4Var.Y0;
                    org.telegram.ui.ActionBar.b6 b6Var = this.f11945u0;
                    gc h = new oc(l3Var, b6Var).h(document, 2, new fh.i(this, this.f11944t0, b6Var, 4));
                    if (h != null) {
                        h.f28730a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof s41;
        m9 m9Var = this.f11944t0;
        i4 i4Var = this.f11946v0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(i4Var.f11609y2).getUser(Utilities.parseLong(((s41) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(i4Var.f11609y2).openChatOrProfileWith(user, null, m9Var.f11797f, 0, false);
            }
        } else if (characterStyle instanceof p41) {
            String url = ((p41) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    m9Var.H(new l30(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                m9Var.H(new k90(bundle, null));
                return;
            }
            String b10 = ve.e.b(url);
            if (b10 != null) {
                String lowerCase = b10.toLowerCase();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(i4Var.f11609y2).openByUserName(lowerCase, m9Var.f11797f, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof r41);
        } else if (characterStyle instanceof o41) {
            o41 o41Var = (o41) characterStyle;
            AndroidUtilities.addToClipboard(o41Var.f31283a.subSequence(o41Var.f31284b, o41Var.f31285c).toString());
            ll.o(R.string.TextCopied, new oc(i4Var.Y0, this.f11945u0));
        } else if (characterStyle instanceof ClickableSpan) {
            ((ClickableSpan) characterStyle).onClick(view);
        }
    }

    @Override
    public final void H(final URLSpan uRLSpan, final View view, g gVar) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = ve.e.v(parse, null, null, ve.e.a(parse.getHost()), null);
            } catch (Exception e10) {
                FileLog.e((Throwable) e10, false);
            }
            str = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e11) {
            FileLog.e(e11);
            str = url2;
        }
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.b6 b6Var = this.f11945u0;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, b6Var, false, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        f3Var.multipleLinesTitle = true;
        i4 i4Var = this.f11946v0;
        g4 g4Var = i4Var.K1;
        CharSequence[] charSequenceArr = (g4Var == null || g4Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.b6 b6Var2 = this.f11945u0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i9) {
                p3 p3Var = p3.this;
                if (i9 == 0) {
                    p3Var.G(uRLSpan, view);
                } else if (i9 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new oc(p3Var.f11946v0.Y0, b6Var2).k(false).j();
                }
            }
        };
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = onClickListener;
        f3Var.setOnHideListener(new eh.l(gVar, 4));
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, b6Var));
        ((d9) i4Var.M1).h(f3Var);
    }

    @Override
    public final void I(z7 z7Var) {
        if (z7Var == null) {
            return;
        }
        final TLRPC.Document document = z7Var.f12386g;
        i4 i4Var = this.f11946v0;
        m9 m9Var = this.f11944t0;
        final org.telegram.ui.ActionBar.b6 b6Var = this.f11945u0;
        if (document != null) {
            x60 F = x60.F(m9Var.v, b6Var, i4Var.G0);
            F.f34562i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) {
                public final p3 f11754b;

                {
                    this.f11754b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            i4 i4Var2 = this.f11754b.f11946v0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i4Var2.f11609y2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(i4Var2.f11609y2).getClientUserId();
                            g4 g4Var = i4Var2.K1;
                            if (g4Var != null) {
                                storyItem = g4Var.f11466a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new oc(i4Var2.Y0, b6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new hc(0))).k(true);
                            return;
                        default:
                            i4 i4Var3 = this.f11754b.f11946v0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f22408id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f22392id = document2.f22386id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(i4Var3.f11609y2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(i4Var3.f11609y2).sendRequest(tL_account_saveMusic, null);
                            new oc(i4Var3.Y0, b6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) {
                public final p3 f11754b;

                {
                    this.f11754b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            i4 i4Var2 = this.f11754b.f11946v0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i4Var2.f11609y2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(i4Var2.f11609y2).getClientUserId();
                            g4 g4Var = i4Var2.K1;
                            if (g4Var != null) {
                                storyItem = g4Var.f11466a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new oc(i4Var2.Y0, b6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new hc(0))).k(true);
                            return;
                        default:
                            i4 i4Var3 = this.f11754b.f11946v0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f22408id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f22392id = document2.f22386id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(i4Var3.f11609y2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(i4Var3.f11609y2).sendRequest(tL_account_saveMusic, null);
                            new oc(i4Var3.Y0, b6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (z7Var.f12384e && z7Var.f12382b != null && z7Var.d != null) {
            Bundle bundle = new Bundle();
            if (z7Var.f12382b.longValue() >= 0) {
                bundle.putLong("user_id", z7Var.f12382b.longValue());
            } else {
                bundle.putLong("chat_id", -z7Var.f12382b.longValue());
            }
            bundle.putInt("message_id", z7Var.d.intValue());
            m9Var.H(new qn(bundle));
        } else if (z7Var.f12382b != null && z7Var.f12383c != null) {
            MessagesController.getInstance(i4Var.f11609y2).getStoriesController().d0(z7Var.f12382b.longValue(), z7Var.f12383c.intValue(), new bg.v1(this, z7Var, m9Var, b6Var, 1));
        } else {
            gc Q = new oc(i4Var.Y0, b6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
            Q.f28730a = 3;
            Q.k(true);
        }
    }

    public final void M(int i9, String str, CharacterStyle characterStyle, boolean z10) {
        boolean z11;
        vz0 vz0Var;
        if (!z10 && !AndroidUtilities.shouldShowUrlInAlert(str)) {
            if (i9 == 0) {
                ve.e.q(getContext(), Uri.parse(str), true, true, null);
                return;
            } else if (i9 == 1) {
                ve.e.q(getContext(), Uri.parse(str), false, false, null);
                return;
            } else if (i9 == 2) {
                ve.e.q(getContext(), Uri.parse(str), false, true, null);
                return;
            } else {
                return;
            }
        }
        m9 m9Var = this.f11944t0;
        if (i9 != 0 && i9 != 2) {
            if (i9 == 1) {
                org.telegram.ui.Components.y4.r0(m9Var.f11797f, str, true, true, false, false, null, null, this.f11945u0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof r41) && (vz0Var = ((r41) characterStyle).f32081a) != null && (vz0Var.f34062a & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.y4.r0(m9Var.f11797f, str, true, true, true, z11, null, null, this.f11945u0);
    }
}
