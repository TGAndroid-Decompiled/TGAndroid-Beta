package nh;

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
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s01;
import org.telegram.ui.xn;
public final class m3 extends a8 {
    public final i9 f15603u0;
    public final org.telegram.ui.ActionBar.f6 f15604v0;
    public final d4 f15605w0;

    public m3(d4 d4Var, Context context, b bVar, i9 i9Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, bVar);
        this.f15605w0 = d4Var;
        this.f15603u0 = i9Var;
        this.f15604v0 = f6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.u5 u5Var) {
        if (u5Var != null) {
            d4 d4Var = this.f15605w0;
            if (d4Var.N1 != null) {
                TLRPC.Document document = u5Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.l5.f(d4Var.f15263z2, u5Var.documentId);
                }
                if (document != null) {
                    i3 i3Var = d4Var.Z0;
                    org.telegram.ui.ActionBar.f6 f6Var = this.f15604v0;
                    ic h = new qc(i3Var, f6Var).h(document, 2, new kh.h(this, this.f15603u0, f6Var, 4));
                    if (h != null) {
                        h.f25666a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z4 = characterStyle instanceof p51;
        i9 i9Var = this.f15603u0;
        d4 d4Var = this.f15605w0;
        if (z4) {
            TLRPC.User user = MessagesController.getInstance(d4Var.f15263z2).getUser(Utilities.parseLong(((p51) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(d4Var.f15263z2).openChatOrProfileWith(user, null, i9Var.f15461f, 0, false);
            }
        } else if (characterStyle instanceof m51) {
            String url = ((m51) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    i9Var.H(new d40(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                i9Var.H(new da0(bundle, null));
                return;
            }
            String b10 = af.g.b(url);
            if (b10 != null) {
                String lowerCase = b10.toLowerCase();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(d4Var.f15263z2).openByUserName(lowerCase, i9Var.f15461f, 0, null);
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
            AndroidUtilities.addToClipboard(l51Var.f26575a.subSequence(l51Var.f26576b, l51Var.f26577c).toString());
            org.telegram.ui.b.m(R.string.TextCopied, new qc(d4Var.Z0, this.f15604v0));
        } else if (characterStyle instanceof ClickableSpan) {
            ((ClickableSpan) characterStyle).onClick(view);
        }
    }

    @Override
    public final void H(final URLSpan uRLSpan, final View view, n5 n5Var) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = af.g.v(parse, null, null, af.g.a(parse.getHost()), null);
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
            str = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e6) {
            FileLog.e(e6);
            str = url2;
        }
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.f15604v0;
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(context, f6Var, false, false);
        g3Var.fixNavigationBar();
        g3Var.title = str;
        g3Var.bigTitle = false;
        g3Var.multipleLinesTitle = true;
        d4 d4Var = this.f15605w0;
        b4 b4Var = d4Var.L1;
        CharSequence[] charSequenceArr = (b4Var == null || b4Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.f6 f6Var2 = this.f15604v0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                m3 m3Var = m3.this;
                if (i10 == 0) {
                    m3Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new qc(m3Var.f15605w0.Z0, f6Var2).k(false).j();
                }
            }
        };
        g3Var.items = charSequenceArr;
        g3Var.onClickListener = onClickListener;
        g3Var.setOnHideListener(new eg.d0(n5Var, 6));
        g3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19977h5, f6Var));
        ((z8) d4Var.N1).h(g3Var);
    }

    @Override
    public final void I(v7 v7Var) {
        if (v7Var == null) {
            return;
        }
        final TLRPC.Document document = v7Var.f15999g;
        d4 d4Var = this.f15605w0;
        i9 i9Var = this.f15603u0;
        final org.telegram.ui.ActionBar.f6 f6Var = this.f15604v0;
        if (document != null) {
            o70 F = o70.F(i9Var.v, f6Var, d4Var.H0);
            F.f27471i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) {
                public final m3 f15516b;

                {
                    this.f15516b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            d4 d4Var2 = this.f15516b.f15605w0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(d4Var2.f15263z2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(d4Var2.f15263z2).getClientUserId();
                            b4 b4Var = d4Var2.L1;
                            if (b4Var != null) {
                                storyItem = b4Var.f15111a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new qc(d4Var2.Z0, f6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new cg.n0(28))).k(true);
                            return;
                        default:
                            d4 d4Var3 = this.f15516b.f15605w0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f19212id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f19196id = document2.f19190id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(d4Var3.f15263z2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(d4Var3.f15263z2).sendRequest(tL_account_saveMusic, null);
                            new qc(d4Var3.Z0, f6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) {
                public final m3 f15516b;

                {
                    this.f15516b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            d4 d4Var2 = this.f15516b.f15605w0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(d4Var2.f15263z2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(d4Var2.f15263z2).getClientUserId();
                            b4 b4Var = d4Var2.L1;
                            if (b4Var != null) {
                                storyItem = b4Var.f15111a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new qc(d4Var2.Z0, f6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new cg.n0(28))).k(true);
                            return;
                        default:
                            d4 d4Var3 = this.f15516b.f15605w0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f19212id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f19196id = document2.f19190id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(d4Var3.f15263z2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(d4Var3.f15263z2).sendRequest(tL_account_saveMusic, null);
                            new qc(d4Var3.Z0, f6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (v7Var.e && v7Var.f15996b != null && v7Var.d != null) {
            Bundle bundle = new Bundle();
            if (v7Var.f15996b.longValue() >= 0) {
                bundle.putLong("user_id", v7Var.f15996b.longValue());
            } else {
                bundle.putLong("chat_id", -v7Var.f15996b.longValue());
            }
            bundle.putInt("message_id", v7Var.d.intValue());
            i9Var.H(new xn(bundle));
        } else if (v7Var.f15996b != null && v7Var.f15997c != null) {
            MessagesController.getInstance(d4Var.f15263z2).getStoriesController().d0(v7Var.f15996b.longValue(), v7Var.f15997c.intValue(), new gg.n1(this, v7Var, i9Var, f6Var, 1));
        } else {
            ic Q = new qc(d4Var.Z0, f6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
            Q.f25666a = 3;
            Q.k(true);
        }
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z4) {
        boolean z10;
        s01 s01Var;
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
        i9 i9Var = this.f15603u0;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                org.telegram.ui.Components.z4.r0(i9Var.f15461f, str, true, true, false, false, null, null, this.f15604v0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof o51) && (s01Var = ((o51) characterStyle).f27452a) != null && (s01Var.f28583a & 1024) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.z4.r0(i9Var.f15461f, str, true, true, true, z10, null, null, this.f15604v0);
    }
}
