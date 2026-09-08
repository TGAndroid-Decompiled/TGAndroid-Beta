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
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;
public final class s4 extends ea {
    public final pb f3712x0;
    public final org.telegram.ui.ActionBar.f6 f3713y0;
    public final o5 f3714z0;

    public s4(o5 o5Var, Context context, b bVar, pb pbVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, bVar);
        this.f3714z0 = o5Var;
        this.f3712x0 = pbVar;
        this.f3713y0 = f6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.z5 z5Var) {
        if (z5Var != null) {
            o5 o5Var = this.f3714z0;
            if (o5Var.Q1 != null) {
                TLRPC.Document document = z5Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.q5.f(o5Var.C2, z5Var.documentId);
                }
                if (document != null) {
                    l4 l4Var = o5Var.f3436c1;
                    org.telegram.ui.ActionBar.f6 f6Var = this.f3713y0;
                    qc h = new yc(l4Var, f6Var).h(document, 2, new o4(this, this.f3712x0, f6Var, 0));
                    if (h != null) {
                        h.f29699a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof o51;
        pb pbVar = this.f3712x0;
        o5 o5Var = this.f3714z0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(o5Var.C2).getUser(Utilities.parseLong(((o51) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(o5Var.C2).openChatOrProfileWith(user, null, pbVar.f3572f, 0, false);
            }
        } else if (characterStyle instanceof l51) {
            String url = ((l51) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    pbVar.H(new b40(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                pbVar.H(new ca0(bundle, null));
                return;
            }
            String b10 = of.f.b(url);
            if (b10 != null) {
                String lowerCase = b10.toLowerCase();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(o5Var.C2).openByUserName(lowerCase, pbVar.f3572f, 0, null);
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
            AndroidUtilities.addToClipboard(k51Var.f27725a.subSequence(k51Var.f27726b, k51Var.f27727c).toString());
            wl.o(R.string.TextCopied, new yc(o5Var.f3436c1, this.f3713y0));
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f3713y0;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, f6Var, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        f3Var.multipleLinesTitle = true;
        o5 o5Var = this.f3714z0;
        m5 m5Var = o5Var.O1;
        CharSequence[] charSequenceArr = (m5Var == null || m5Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.f6 f6Var2 = this.f3713y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                s4 s4Var = s4.this;
                if (i10 == 0) {
                    s4Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new yc(s4Var.f3714z0.f3436c1, f6Var2).k(false).j();
                }
            }
        };
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = onClickListener;
        f3Var.setOnHideListener(new r4(dVar, 0));
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20761h5, f6Var));
        ((gb) o5Var.Q1).h(f3Var);
    }

    @Override
    public final void I(z9 z9Var) {
        if (z9Var == null) {
            return;
        }
        final TLRPC.Document document = z9Var.f4106g;
        o5 o5Var = this.f3714z0;
        pb pbVar = this.f3712x0;
        final org.telegram.ui.ActionBar.f6 f6Var = this.f3713y0;
        if (document != null) {
            n70 F = n70.F(pbVar.v, f6Var, o5Var.K0);
            F.f28669i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) {
                public final s4 f3335b;

                {
                    this.f3335b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            o5 o5Var2 = this.f3335b.f3714z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(o5Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(o5Var2.C2).getClientUserId();
                            m5 m5Var = o5Var2.O1;
                            if (m5Var != null) {
                                storyItem = m5Var.f3337a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new yc(o5Var2.f3436c1, f6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new ah.j(26))).k(true);
                            return;
                        default:
                            o5 o5Var3 = this.f3335b.f3714z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f19924id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f19908id = document2.f19902id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(o5Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(o5Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new yc(o5Var3.f3436c1, f6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) {
                public final s4 f3335b;

                {
                    this.f3335b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            o5 o5Var2 = this.f3335b.f3714z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(o5Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(o5Var2.C2).getClientUserId();
                            m5 m5Var = o5Var2.O1;
                            if (m5Var != null) {
                                storyItem = m5Var.f3337a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new yc(o5Var2.f3436c1, f6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new ah.j(26))).k(true);
                            return;
                        default:
                            o5 o5Var3 = this.f3335b.f3714z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f19924id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f19908id = document2.f19902id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(o5Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(o5Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new yc(o5Var3.f3436c1, f6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (z9Var.f4104e && z9Var.f4102b != null && z9Var.d != null) {
            Bundle bundle = new Bundle();
            if (z9Var.f4102b.longValue() >= 0) {
                bundle.putLong("user_id", z9Var.f4102b.longValue());
            } else {
                bundle.putLong("chat_id", -z9Var.f4102b.longValue());
            }
            bundle.putInt("message_id", z9Var.d.intValue());
            pbVar.H(new co(bundle));
        } else if (z9Var.f4102b != null && z9Var.f4103c != null) {
            MessagesController.getInstance(o5Var.C2).getStoriesController().d0(z9Var.f4102b.longValue(), z9Var.f4103c.intValue(), new n4(this, z9Var, pbVar, f6Var, 0));
        } else {
            qc Q = new yc(o5Var.f3436c1, f6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
            Q.f29699a = 3;
            Q.k(true);
        }
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        boolean z11;
        n01 n01Var;
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
        pb pbVar = this.f3712x0;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                org.telegram.ui.Components.e5.r0(pbVar.f3572f, str, true, true, false, false, null, null, this.f3713y0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof n51) && (n01Var = ((n51) characterStyle).f28651a) != null && (n01Var.f28618a & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.e5.r0(pbVar.f3572f, str, true, true, true, z11, null, null, this.f3713y0);
    }
}
