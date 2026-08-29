package lh;

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
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.z30;
import org.telegram.ui.Components.z41;
import org.telegram.ui.tn;
public final class l3 extends a8 {
    public final i9 f15874t0;
    public final org.telegram.ui.ActionBar.c6 f15875u0;
    public final d4 f15876v0;

    public l3(d4 d4Var, Context context, b bVar, i9 i9Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, bVar);
        this.f15876v0 = d4Var;
        this.f15874t0 = i9Var;
        this.f15875u0 = c6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.y5 y5Var) {
        if (y5Var != null) {
            d4 d4Var = this.f15876v0;
            if (d4Var.M1 != null) {
                TLRPC.Document document = y5Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.p5.f(d4Var.f15545y2, y5Var.documentId);
                }
                if (document != null) {
                    h3 h3Var = d4Var.Y0;
                    org.telegram.ui.ActionBar.c6 c6Var = this.f15875u0;
                    mc h = new tc(h3Var, c6Var).h(document, 2, new ih.i(this, this.f15874t0, c6Var, 4));
                    if (h != null) {
                        h.f30645a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof d51;
        i9 i9Var = this.f15874t0;
        d4 d4Var = this.f15876v0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(d4Var.f15545y2).getUser(Utilities.parseLong(((d51) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(d4Var.f15545y2).openChatOrProfileWith(user, null, i9Var.f15756f, 0, false);
            }
        } else if (characterStyle instanceof a51) {
            String url = ((a51) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    i9Var.H(new z30(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                i9Var.H(new y90(bundle, null));
                return;
            }
            String b10 = ye.d.b(url);
            if (b10 != null) {
                String lowerCase = b10.toLowerCase();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(d4Var.f15545y2).openByUserName(lowerCase, i9Var.f15756f, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof c51);
        } else if (characterStyle instanceof z41) {
            z41 z41Var = (z41) characterStyle;
            AndroidUtilities.addToClipboard(z41Var.f35212a.subSequence(z41Var.f35213b, z41Var.f35214c).toString());
            org.telegram.ui.b.n(R.string.TextCopied, new tc(d4Var.Y0, this.f15875u0));
        } else if (characterStyle instanceof ClickableSpan) {
            ((ClickableSpan) characterStyle).onClick(view);
        }
    }

    @Override
    public final void H(final URLSpan uRLSpan, final View view, m5 m5Var) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = ye.d.v(parse, null, null, ye.d.a(parse.getHost()), null);
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
        org.telegram.ui.ActionBar.c6 c6Var = this.f15875u0;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, c6Var, false, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        f3Var.multipleLinesTitle = true;
        d4 d4Var = this.f15876v0;
        b4 b4Var = d4Var.K1;
        CharSequence[] charSequenceArr = (b4Var == null || b4Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.c6 c6Var2 = this.f15875u0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                l3 l3Var = l3.this;
                if (i10 == 0) {
                    l3Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new tc(l3Var.f15876v0.Y0, c6Var2).k(false).j();
                }
            }
        };
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = onClickListener;
        f3Var.setOnHideListener(new cg.d0(m5Var, 6));
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, c6Var));
        ((z8) d4Var.M1).h(f3Var);
    }

    @Override
    public final void I(v7 v7Var) {
        if (v7Var == null) {
            return;
        }
        final TLRPC.Document document = v7Var.f16328g;
        d4 d4Var = this.f15876v0;
        i9 i9Var = this.f15874t0;
        final org.telegram.ui.ActionBar.c6 c6Var = this.f15875u0;
        if (document != null) {
            j70 F = j70.F(i9Var.v, c6Var, d4Var.G0);
            F.f29582i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) {
                public final l3 f15713b;

                {
                    this.f15713b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            d4 d4Var2 = this.f15713b.f15876v0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(d4Var2.f15545y2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(d4Var2.f15545y2).getClientUserId();
                            b4 b4Var = d4Var2.K1;
                            if (b4Var != null) {
                                storyItem = b4Var.f15374a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new tc(d4Var2.Y0, c6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new org.telegram.ui.Components.g5(2))).k(true);
                            return;
                        default:
                            d4 d4Var3 = this.f15713b.f15876v0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f22420id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f22404id = document2.f22398id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(d4Var3.f15545y2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(d4Var3.f15545y2).sendRequest(tL_account_saveMusic, null);
                            new tc(d4Var3.Y0, c6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) {
                public final l3 f15713b;

                {
                    this.f15713b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    switch (r4) {
                        case 0:
                            d4 d4Var2 = this.f15713b.f15876v0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(d4Var2.f15545y2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(d4Var2.f15545y2).getClientUserId();
                            b4 b4Var = d4Var2.K1;
                            if (b4Var != null) {
                                storyItem = b4Var.f15374a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new tc(d4Var2.Y0, c6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new org.telegram.ui.Components.g5(2))).k(true);
                            return;
                        default:
                            d4 d4Var3 = this.f15713b.f15876v0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f22420id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f22404id = document2.f22398id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(d4Var3.f15545y2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(d4Var3.f15545y2).sendRequest(tL_account_saveMusic, null);
                            new tc(d4Var3.Y0, c6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (v7Var.f16326e && v7Var.f16324b != null && v7Var.d != null) {
            Bundle bundle = new Bundle();
            if (v7Var.f16324b.longValue() >= 0) {
                bundle.putLong("user_id", v7Var.f16324b.longValue());
            } else {
                bundle.putLong("chat_id", -v7Var.f16324b.longValue());
            }
            bundle.putInt("message_id", v7Var.d.intValue());
            i9Var.H(new tn(bundle));
        } else if (v7Var.f16324b != null && v7Var.f16325c != null) {
            MessagesController.getInstance(d4Var.f15545y2).getStoriesController().d0(v7Var.f16324b.longValue(), v7Var.f16325c.intValue(), new eg.o1(this, v7Var, i9Var, c6Var, 1));
        } else {
            mc Q = new tc(d4Var.Y0, c6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
            Q.f30645a = 3;
            Q.k(true);
        }
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        boolean z11;
        h01 h01Var;
        if (!z10 && !AndroidUtilities.shouldShowUrlInAlert(str)) {
            if (i10 == 0) {
                ye.d.q(getContext(), Uri.parse(str), true, true, null);
                return;
            } else if (i10 == 1) {
                ye.d.q(getContext(), Uri.parse(str), false, false, null);
                return;
            } else if (i10 == 2) {
                ye.d.q(getContext(), Uri.parse(str), false, true, null);
                return;
            } else {
                return;
            }
        }
        i9 i9Var = this.f15874t0;
        if (i10 != 0 && i10 != 2) {
            if (i10 == 1) {
                org.telegram.ui.Components.c5.r0(i9Var.f15756f, str, true, true, false, false, null, null, this.f15875u0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof c51) && (h01Var = ((c51) characterStyle).f27311a) != null && (h01Var.f29024a & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.c5.r0(i9Var.f15756f, str, true, true, true, z11, null, null, this.f15875u0);
    }
}
