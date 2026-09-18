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
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;
public final class h5 extends xa {
    public final jc f944x0;
    public final org.telegram.ui.ActionBar.f6 f945y0;
    public final f6 f946z0;

    public h5(f6 f6Var, Context context, d dVar, jc jcVar, org.telegram.ui.ActionBar.f6 f6Var2) {
        super(context, dVar);
        this.f946z0 = f6Var;
        this.f944x0 = jcVar;
        this.f945y0 = f6Var2;
    }

    @Override
    public final void F(org.telegram.ui.Components.x5 x5Var) {
        if (x5Var != null) {
            f6 f6Var = this.f946z0;
            if (f6Var.Q1 != null) {
                TLRPC.Document document = x5Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.o5.f(f6Var.C2, x5Var.documentId);
                }
                if (document != null) {
                    a5 a5Var = f6Var.f803c1;
                    org.telegram.ui.ActionBar.f6 f6Var2 = this.f945y0;
                    org.telegram.ui.Components.oc h = new vc(a5Var, f6Var2).h(document, 2, new d5(this, this.f944x0, f6Var2, 0));
                    if (h != null) {
                        h.f26699a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof q51;
        jc jcVar = this.f944x0;
        f6 f6Var = this.f946z0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(f6Var.C2).getUser(Utilities.parseLong(((q51) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(f6Var.C2).openChatOrProfileWith(user, null, jcVar.f1080f, 0, false);
            }
        } else if (characterStyle instanceof n51) {
            String url = ((n51) characterStyle).getURL();
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
                    MessagesController.getInstance(f6Var.C2).openByUserName(lowerCase, jcVar.f1080f, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof p51);
        } else if (characterStyle instanceof m51) {
            m51 m51Var = (m51) characterStyle;
            AndroidUtilities.addToClipboard(m51Var.f26066a.subSequence(m51Var.f26067b, m51Var.f26068c).toString());
            wl.o(R.string.TextCopied, new vc(f6Var.f803c1, this.f945y0));
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f945y0;
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(1, context, f6Var, false);
        g3Var.fixNavigationBar();
        g3Var.title = str;
        g3Var.bigTitle = false;
        g3Var.multipleLinesTitle = true;
        f6 f6Var2 = this.f946z0;
        d6 d6Var = f6Var2.O1;
        CharSequence[] charSequenceArr = (d6Var == null || d6Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.f6 f6Var3 = this.f945y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                h5 h5Var = h5.this;
                if (i10 == 0) {
                    h5Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new vc(h5Var.f946z0.f803c1, f6Var3).k(false).j();
                }
            }
        };
        g3Var.items = charSequenceArr;
        g3Var.onClickListener = onClickListener;
        g3Var.setOnHideListener(new g5(dVar, 0));
        g3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18934h5, f6Var));
        ((ac) f6Var2.Q1).h(g3Var);
    }

    @Override
    public final void I(sa saVar) {
        if (saVar == null) {
            return;
        }
        final TLRPC.Document document = saVar.f1517g;
        f6 f6Var = this.f946z0;
        jc jcVar = this.f944x0;
        final org.telegram.ui.ActionBar.f6 f6Var2 = this.f945y0;
        if (document != null) {
            n70 F = n70.F(jcVar.v, f6Var2, f6Var.K0);
            F.f26369i = 3;
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
                            f6 f6Var3 = this.f580b.f946z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(f6Var3.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(f6Var3.C2).getClientUserId();
                            d6 d6Var = f6Var3.O1;
                            if (d6Var != null) {
                                storyItem = d6Var.f706a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new vc(f6Var3.f803c1, f6Var2).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new f(25))).k(true);
                            return;
                        default:
                            f6 f6Var4 = this.f580b.f946z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f18149id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f18133id = document2.f18127id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(f6Var4.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(f6Var4.C2).sendRequest(tL_account_saveMusic, null);
                            new vc(f6Var4.f803c1, f6Var2).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
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
                            f6 f6Var3 = this.f580b.f946z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(f6Var3.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(f6Var3.C2).getClientUserId();
                            d6 d6Var = f6Var3.O1;
                            if (d6Var != null) {
                                storyItem = d6Var.f706a;
                            } else {
                                storyItem = null;
                            }
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new vc(f6Var3.f803c1, f6Var2).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new f(25))).k(true);
                            return;
                        default:
                            f6 f6Var4 = this.f580b.f946z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f18149id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.f18133id = document2.f18127id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(f6Var4.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(f6Var4.C2).sendRequest(tL_account_saveMusic, null);
                            new vc(f6Var4.f803c1, f6Var2).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
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
            jcVar.H(new bo(bundle));
        } else if (saVar.f1514b != null && saVar.f1515c != null) {
            MessagesController.getInstance(f6Var.C2).getStoriesController().d0(saVar.f1514b.longValue(), saVar.f1515c.intValue(), new c5(this, saVar, jcVar, f6Var2, 0));
        } else {
            org.telegram.ui.Components.oc Q = new vc(f6Var.f803c1, f6Var2).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
            Q.f26699a = 3;
            Q.k(true);
        }
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        boolean z11;
        p01 p01Var;
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
                org.telegram.ui.Components.c5.r0(jcVar.f1080f, str, true, true, false, false, null, null, this.f945y0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof p51) && (p01Var = ((p51) characterStyle).f26936a) != null && (p01Var.f26908a & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.c5.r0(jcVar.f1080f, str, true, true, true, z11, null, null, this.f945y0);
    }
}
