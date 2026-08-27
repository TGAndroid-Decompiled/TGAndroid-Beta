package jh;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import hh.y9;
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
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.rn;

public final class n3 extends a8 {

    public final i9 f13694t0;

    public final org.telegram.ui.ActionBar.c6 f13695u0;

    public final e4 f13696v0;

    public n3(e4 e4Var, Context context, b bVar, i9 i9Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, bVar);
        this.f13696v0 = e4Var;
        this.f13694t0 = i9Var;
        this.f13695u0 = c6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.t5 t5Var) {
        if (t5Var != null) {
            e4 e4Var = this.f13696v0;
            if (e4Var.M1 == null) {
                return;
            }
            TLRPC.Document documentF = t5Var.document;
            if (documentF == null) {
                documentF = org.telegram.ui.Components.k5.f(e4Var.f13296y2, t5Var.documentId);
            }
            if (documentF == null) {
                return;
            }
            j3 j3Var = e4Var.Y0;
            org.telegram.ui.ActionBar.c6 c6Var = this.f13695u0;
            ec ecVarH = new mc(j3Var, c6Var).h(documentF, 2, new gh.i(this, this.f13694t0, c6Var, 4));
            if (ecVarH == null) {
                return;
            }
            ecVarH.f28013a = 1;
            ecVarH.k(true);
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof u41;
        i9 i9Var = this.f13694t0;
        e4 e4Var = this.f13696v0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(e4Var.f13296y2).getUser(Utilities.parseLong(((u41) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(e4Var.f13296y2).openChatOrProfileWith(user, null, i9Var.f13478f, 0, false);
                return;
            }
            return;
        }
        if (!(characterStyle instanceof r41)) {
            if (characterStyle instanceof URLSpan) {
                M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof t41);
                return;
            }
            if (!(characterStyle instanceof q41)) {
                if (characterStyle instanceof ClickableSpan) {
                    ((ClickableSpan) characterStyle).onClick(view);
                    return;
                }
                return;
            } else {
                q41 q41Var = (q41) characterStyle;
                AndroidUtilities.addToClipboard(q41Var.f31790a.subSequence(q41Var.f31791b, q41Var.f31792c).toString());
                rl.m(R.string.TextCopied, new mc(e4Var.Y0, this.f13695u0));
                return;
            }
        }
        String url = ((r41) characterStyle).getURL();
        if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
            if (url.contains("@")) {
                i9Var.H(new q30(url, null));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("type", 3);
            bundle.putString("hashtag", url);
            i9Var.H(new o90(bundle, null));
            return;
        }
        String strB = we.e.b(url);
        if (strB == null) {
            M(0, url, characterStyle, false);
            return;
        }
        String lowerCase = strB.toLowerCase();
        if (url.startsWith("@")) {
            MessagesController.getInstance(e4Var.f13296y2).openByUserName(lowerCase, i9Var.f13478f, 0, null);
        } else {
            M(0, url, characterStyle, false);
        }
    }

    @Override
    public final void H(final URLSpan uRLSpan, final View view, y9 y9Var) {
        String strDecode;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri uri = Uri.parse(url2);
                url2 = we.e.v(uri, null, null, we.e.a(uri.getHost()), null);
            } catch (Exception e9) {
                FileLog.e((Throwable) e9, false);
            }
            strDecode = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e10) {
            FileLog.e(e10);
            strDecode = url2;
        }
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.c6 c6Var = this.f13695u0;
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, c6Var, false, false);
        e3Var.fixNavigationBar();
        e3Var.title = strDecode;
        e3Var.bigTitle = false;
        e3Var.multipleLinesTitle = true;
        e4 e4Var = this.f13696v0;
        c4 c4Var = e4Var.K1;
        CharSequence[] charSequenceArr = (c4Var == null || c4Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.c6 c6Var2 = this.f13695u0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                n3 n3Var = this.f13650a;
                if (i10 == 0) {
                    n3Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new mc(n3Var.f13696v0.Y0, c6Var2).k(false).j();
                }
            }
        };
        e3Var.items = charSequenceArr;
        e3Var.onClickListener = onClickListener;
        e3Var.setOnHideListener(new ag.j0(y9Var, 6));
        e3Var.fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var));
        ((z8) e4Var.M1).h(e3Var);
    }

    @Override
    public final void I(v7 v7Var) {
        if (v7Var == null) {
            return;
        }
        final TLRPC.Document document = v7Var.f14063g;
        e4 e4Var = this.f13696v0;
        i9 i9Var = this.f13694t0;
        final org.telegram.ui.ActionBar.c6 c6Var = this.f13695u0;
        if (document != null) {
            b70 b70VarF = b70.F(i9Var.v, c6Var, e4Var.G0);
            b70VarF.f26974i = 3;
            b70VarF.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            final int i10 = 0;
            b70VarF.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) {

                public final n3 f13570b;

                {
                    this.f13570b = this;
                }

                @Override
                public final void run() {
                    switch (i10) {
                        case 0:
                            e4 e4Var2 = this.f13570b.f13696v0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(e4Var2.f13296y2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(e4Var2.f13296y2).getClientUserId();
                            c4 c4Var = e4Var2.K1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, c4Var != null ? c4Var.f13141a : null, null, false));
                            new mc(e4Var2.Y0, c6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new ag.l3(29))).k(true);
                            break;
                        default:
                            e4 e4Var3 = this.f13570b.f13696v0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f22408id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f22392id = document2.f22386id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(e4Var3.f13296y2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(e4Var3.f13296y2).sendRequest(tL_account_saveMusic, null);
                            new mc(e4Var3.Y0, c6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            break;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            final int i11 = 1;
            b70VarF.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) {

                public final n3 f13570b;

                {
                    this.f13570b = this;
                }

                @Override
                public final void run() {
                    switch (i11) {
                        case 0:
                            e4 e4Var2 = this.f13570b.f13696v0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(e4Var2.f13296y2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(e4Var2.f13296y2).getClientUserId();
                            c4 c4Var = e4Var2.K1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, c4Var != null ? c4Var.f13141a : null, null, false));
                            new mc(e4Var2.Y0, c6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new ag.l3(29))).k(true);
                            break;
                        default:
                            e4 e4Var3 = this.f13570b.f13696v0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f22408id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f22392id = document2.f22386id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(e4Var3.f13296y2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(e4Var3.f13296y2).sendRequest(tL_account_saveMusic, null);
                            new mc(e4Var3.Y0, c6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            break;
                    }
                }
            }, false);
            b70VarF.Z();
            return;
        }
        if (v7Var.f14061e && v7Var.f14059b != null && v7Var.d != null) {
            Bundle bundle = new Bundle();
            if (v7Var.f14059b.longValue() >= 0) {
                bundle.putLong("user_id", v7Var.f14059b.longValue());
            } else {
                bundle.putLong("chat_id", -v7Var.f14059b.longValue());
            }
            bundle.putInt("message_id", v7Var.d.intValue());
            i9Var.H(new rn(bundle));
            return;
        }
        if (v7Var.f14059b != null && v7Var.f14060c != null) {
            MessagesController.getInstance(e4Var.f13296y2).getStoriesController().d0(v7Var.f14059b.longValue(), v7Var.f14060c.intValue(), new cg.p1(this, v7Var, i9Var, c6Var, 1));
            return;
        }
        ec ecVarQ = new mc(e4Var.Y0, c6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
        ecVarQ.f28013a = 3;
        ecVarQ.k(true);
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        xz0 xz0Var;
        if (z10 || AndroidUtilities.shouldShowUrlInAlert(str)) {
            i9 i9Var = this.f13694t0;
            if (i10 == 0 || i10 == 2) {
                org.telegram.ui.Components.y4.r0(i9Var.f13478f, str, true, true, true, (!(characterStyle instanceof t41) || (xz0Var = ((t41) characterStyle).f32651a) == null || (xz0Var.f34734a & 1024) == 0) ? false : true, null, null, this.f13695u0);
                return;
            } else {
                if (i10 == 1) {
                    org.telegram.ui.Components.y4.r0(i9Var.f13478f, str, true, true, false, false, null, null, this.f13695u0);
                    return;
                }
                return;
            }
        }
        if (i10 == 0) {
            we.e.q(getContext(), Uri.parse(str), true, true, null);
        } else if (i10 == 1) {
            we.e.q(getContext(), Uri.parse(str), false, false, null);
        } else if (i10 == 2) {
            we.e.q(getContext(), Uri.parse(str), false, true, null);
        }
    }
}
