package cg;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.location.Location;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import jh.b5;
import jh.b7;
import jh.c5;
import jh.i9;
import jh.j4;
import jh.m6;
import jh.t4;
import jh.y4;
import nh.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a4;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.d4;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.zo;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.dq;
import org.telegram.ui.fb0;
import org.telegram.ui.jc;
import org.telegram.ui.kh0;
import org.telegram.ui.kk0;
import org.telegram.ui.o60;
import org.telegram.ui.oc;
import org.telegram.ui.oc0;
import org.telegram.ui.py;
import org.telegram.ui.rh0;
import org.telegram.ui.rn;
import org.telegram.ui.ta1;
import org.telegram.ui.tc0;
import org.telegram.ui.v5;
import org.telegram.ui.wg0;
import org.telegram.ui.wu;
import org.telegram.ui.xc;

public final class x0 implements pk0 {

    public final int f2853a;

    public final Object f2854b;

    public final Object f2855c;

    public x0(int i10, Object obj, Object obj2) {
        this.f2853a = i10;
        this.f2854b = obj;
        this.f2855c = obj2;
    }

    @Override
    public final void a(int i10, View view) {
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        n41 n41VarG;
        Object objO;
        ContactsController.Contact contact;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        aa0 aa0Var;
        Paint.FontMetricsInt fontMetricsIntU;
        TLRPC.BotInlineResult botInlineResult;
        String str5;
        up0 up0Var;
        String str6;
        oc0 oc0Var;
        float maxZoomLevel;
        float f10;
        int size = -1;
        int i11 = 0;
        switch (this.f2853a) {
            case 0:
                d1.Q((d1) this.f2854b, (org.telegram.ui.ActionBar.n2) this.f2855c, view);
                break;
            case 1:
                z1.P((z1) this.f2854b, (TLRPC.Chat) this.f2855c, view);
                break;
            case 2:
                c5 c5Var = (c5) this.f2854b;
                i9 i9Var = (i9) this.f2855c;
                org.telegram.ui.ActionBar.n2 n2Var = i9Var.f13478f;
                y4 y4Var = c5Var.f13158w;
                j4 j4Var = c5Var.f13156r;
                if (i10 >= 0 && i10 < y4Var.f14152c.size()) {
                    t4 t4Var = (t4) y4Var.f14152c.get(i10);
                    TL_stories.StoryView storyView = t4Var.f13997b;
                    TL_stories.StoryReaction storyReaction = t4Var.f13998c;
                    if (storyView instanceof TL_stories.TL_storyView) {
                        i9Var.H(ProfileActivity.m4(storyView.user_id));
                    } else if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        n2Var.createOverlayStoryViewer().G(c5Var.getContext(), ((TL_stories.TL_storyViewPublicRepost) t4Var.f13997b).story, b7.a(j4Var));
                    } else if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        i9Var.H(ProfileActivity.m4(DialogObject.getPeerDialogId(storyReaction.peer_id)));
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        ArrayList arrayList2 = new ArrayList();
                        b5 b5Var = c5Var.A;
                        if (b5Var != null && (arrayList = b5Var.f13107i) != null) {
                            int size2 = arrayList.size();
                            while (i11 < c5Var.A.f13107i.size()) {
                                TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) c5Var.A.f13107i.get(i11);
                                if ((storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction2).story) != null) {
                                    storyItem.dialogId = DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id);
                                    if (storyReaction2 == storyReaction) {
                                        size = arrayList2.size();
                                    }
                                    arrayList2.add(storyItem);
                                }
                                i11++;
                            }
                            i11 = size2;
                        }
                        if (size < 0 || arrayList2.size() <= 1) {
                            c5Var.C = null;
                            n2Var.createOverlayStoryViewer().G(c5Var.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, b7.a(j4Var));
                        } else {
                            c5Var.C = new m6(c5Var.v, arrayList2);
                            c5Var.D = i11;
                            b5 b5Var2 = c5Var.A;
                            i9 i9VarCreateOverlayStoryViewer = n2Var.createOverlayStoryViewer();
                            Context context = c5Var.getContext();
                            m6 m6Var = c5Var.C;
                            b7 b7VarA = b7.a(j4Var);
                            b7VarA.f13121e = new h3.x(b5Var2, 23);
                            i9VarCreateOverlayStoryViewer.C(context, size, m6Var, b7VarA);
                        }
                    } else {
                        boolean z11 = storyReaction instanceof TL_stories.TL_storyReactionPublicForward;
                        if (z11 || (storyView instanceof TL_stories.TL_storyViewPublicForward)) {
                            TLRPC.Message message = z11 ? storyReaction.message : storyView.message;
                            Bundle bundle = new Bundle();
                            long peerDialogId = DialogObject.getPeerDialogId(message.peer_id);
                            if (peerDialogId >= 0) {
                                bundle.putLong("user_id", peerDialogId);
                            } else {
                                bundle.putLong("chat_id", -peerDialogId);
                            }
                            bundle.putInt("message_id", message.f22401id);
                            i9Var.H(new rn(bundle));
                        }
                    }
                    break;
                }
                break;
            case 3:
                kh.u uVar = (kh.u) this.f2854b;
                ag.n0 n0Var = (ag.n0) this.f2855c;
                b51 b51Var = uVar.V;
                if (b51Var != null && (n41VarG = b51Var.G(i10 - 1)) != null) {
                    Object obj = n41VarG.G;
                    if (obj instanceof TranslateController.Language) {
                        n0Var.run(((TranslateController.Language) obj).code);
                        uVar.dismiss();
                    }
                }
                break;
            case 4:
                s3.z0((s3) this.f2854b, (Context) this.f2855c, i10);
                break;
            case 5:
                v5.x0((v5) this.f2854b, (Context) this.f2855c, view, i10);
                break;
            case 6:
                xc.V((xc) this.f2854b, (TLRPC.ChatFull) this.f2855c, view, i10);
                break;
            case 7:
                jc jcVar = (jc) this.f2854b;
                oc ocVar = (oc) this.f2855c;
                xc xcVar = jcVar.f39333c;
                int i12 = ocVar.d;
                ta1 ta1Var = ocVar.f41058b;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i12).peerColors;
                xcVar.f44389f = (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) ? 0 : peerColors.colors.get(i10).f19624id;
                xcVar.X0(true);
                xcVar.a1(true);
                xcVar.b1();
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + ta1Var.getPaddingLeft()) {
                    ta1Var.v0(-((AndroidUtilities.dp(48.0f) + ta1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                } else if (view.getWidth() + view.getLeft() > (ta1Var.getMeasuredWidth() - ta1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    ta1Var.v0(org.telegram.messenger.y1.A(48.0f, ta1Var.getMeasuredWidth() - ta1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                }
                break;
            case 8:
                rn rnVar = (rn) this.f2854b;
                rh0 rh0Var = (rh0) this.f2855c;
                rnVar.getClass();
                TLObject tLObject = (TLObject) rh0Var.f41935c.get(i10);
                if (tLObject != null) {
                    rnVar.A7(true);
                    Bundle bundle2 = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle2.putLong("user_id", ((TLRPC.User) tLObject).f22527id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).f22380id);
                    }
                    rnVar.presentFragment(new ProfileActivity(bundle2, null));
                    break;
                }
                break;
            case 9:
                dq.X((dq) this.f2854b, (Context) this.f2855c, view, i10);
                break;
            case 10:
                org.telegram.ui.Components.y yVar = (org.telegram.ui.Components.y) this.f2854b;
                c6 c6Var = (c6) this.f2855c;
                n41 n41VarG2 = yVar.f34746i0.G(i10 - 1);
                if (n41VarG2 != null && n41VarG2.d == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yVar.getContext(), 0, c6Var);
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AIEditorDeleteStyle);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.s(yVar, i11));
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.o();
                }
                break;
            case 11:
                gi.w((gi) this.f2854b, (c6) this.f2855c, view);
                break;
            case 12:
                lj ljVar = (lj) this.f2854b;
                c6 c6Var2 = (c6) this.f2855c;
                ej ejVar = ljVar.A;
                f2.q0 adapter = ljVar.f30397s.getAdapter();
                hj hjVar = ljVar.B;
                if (adapter == hjVar) {
                    objO = hjVar.E(i10);
                } else {
                    int iS = ejVar.S(i10);
                    int iQ = ejVar.Q(i10);
                    if (iQ >= 0 && iS >= 0) {
                        objO = ejVar.O(iS, iQ);
                    }
                }
                if (objO != null) {
                    if (ljVar.f30398w.isEmpty()) {
                        if (objO instanceof ContactsController.Contact) {
                            ContactsController.Contact contact2 = (ContactsController.Contact) objO;
                            TLRPC.User user = contact2.user;
                            if (user != null) {
                                str3 = user.first_name;
                                str4 = user.last_name;
                            } else {
                                str3 = contact2.first_name;
                                str4 = contact2.last_name;
                            }
                            contact = contact2;
                            str2 = str4;
                            str = str3;
                        } else {
                            TLRPC.User user2 = (TLRPC.User) objO;
                            ContactsController.Contact contact3 = new ContactsController.Contact();
                            String str7 = user2.first_name;
                            contact3.first_name = str7;
                            String str8 = user2.last_name;
                            contact3.last_name = str8;
                            contact3.phones.add(user2.phone);
                            contact3.user = user2;
                            contact = contact3;
                            str = str7;
                            str2 = str8;
                        }
                        be0 be0Var = new be0(ljVar.f34900b.f28635b0, contact, null, null, null, null, str, str2, c6Var2);
                        be0Var.G = new vi(ljVar);
                        be0Var.show();
                    } else {
                        ljVar.L((kj) view, objO);
                    }
                }
                break;
            case 13:
                k70 k70Var = (k70) this.f2854b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f2855c;
                g70 g70Var = k70Var.d;
                ArrayList arrayList3 = k70Var.h;
                if (!k70Var.A && arrayList3.get(i10) != k70Var.v) {
                    k70Var.v = (TLRPC.Peer) arrayList3.get(i10);
                    boolean z12 = view instanceof d4;
                    if (z12) {
                        z10 = true;
                        ((d4) view).c(true, true);
                    } else {
                        z10 = true;
                        if (view instanceof org.telegram.ui.Cells.b7) {
                            ((org.telegram.ui.Cells.b7) view).b(true, true);
                            view.invalidate();
                        }
                    }
                    int childCount = g70Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = g70Var.getChildAt(i13);
                        if (childAt != view) {
                            if (z12) {
                                ((d4) childAt).c(false, z10);
                            } else if (view instanceof org.telegram.ui.Cells.b7) {
                                ((org.telegram.ui.Cells.b7) childAt).b(false, z10);
                            }
                        }
                    }
                    if (k70Var.f30029s != 0) {
                        k70Var.x(chat, z10);
                    }
                    break;
                }
                break;
            case 14:
                aa0 aa0Var2 = (aa0) this.f2854b;
                x90 x90Var = (x90) this.f2855c;
                if (i10 != 0) {
                    pf.u0 adapter2 = aa0Var2.getAdapter();
                    if (adapter2.f45944s0 == null || adapter2.f45925d0) {
                        int i14 = i10 - 1;
                        Object objJ = aa0Var2.getAdapter().J(i14);
                        int i15 = aa0Var2.getAdapter().T;
                        int i16 = aa0Var2.getAdapter().U;
                        if (aa0Var2.getAdapter().B != null && i14 == 1) {
                            TLRPC.Chat chat2 = aa0Var2.getAdapter().f45931h0;
                            if (chat2 == null && aa0Var2.getAdapter().C0 != null) {
                                chat2 = aa0Var2.getAdapter().C0.f42026e;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(aa0Var2.getAdapter().B);
                            x90Var.H(i15, i16, a9.p.p(sb2, chat2 != null ? "@" + ChatObject.getPublicUsername(chat2) : "", " "), false);
                        } else if (aa0Var2.getAdapter().B == null || i14 != 0) {
                            if (objJ instanceof TLRPC.TL_document) {
                                if (view instanceof y7) {
                                    ((y7) view).getSendAnimationData();
                                }
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) objJ;
                                x90Var.x(tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), aa0Var2.getAdapter().L(i14));
                            } else if (!(objJ instanceof TLRPC.Chat)) {
                                if (!(objJ instanceof TLRPC.User)) {
                                    aa0Var = aa0Var2;
                                    if (objJ instanceof String) {
                                        x90Var.H(i15, i16, objJ + " ", false);
                                    } else if (objJ instanceof MediaDataController.KeywordResult) {
                                        String str9 = ((MediaDataController.KeywordResult) objJ).emoji;
                                        x90Var.K(str9);
                                        if (str9 != null) {
                                            try {
                                                if (str9.startsWith("animated_")) {
                                                    try {
                                                        fontMetricsIntU = x90Var.u();
                                                    } catch (Exception e9) {
                                                        FileLog.e((Throwable) e9, false);
                                                        fontMetricsIntU = null;
                                                    }
                                                    long j10 = Long.parseLong(str9.substring(9));
                                                    TLRPC.Document documentF = k5.f(UserConfig.selectedAccount, j10);
                                                    SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(documentF));
                                                    spannableString.setSpan(documentF != null ? new t5(documentF, fontMetricsIntU) : new t5(j10, fontMetricsIntU), 0, spannableString.length(), 33);
                                                    x90Var.H(i15, i16, spannableString, false);
                                                } else {
                                                    x90Var.H(i15, i16, str9, true);
                                                }
                                            } catch (Exception unused) {
                                                x90Var.H(i15, i16, str9, true);
                                            }
                                        } else {
                                            x90Var.H(i15, i16, str9, true);
                                        }
                                        aa0Var.o(false);
                                    }
                                    break;
                                } else {
                                    TLRPC.User user3 = (TLRPC.User) objJ;
                                    if (UserObject.getPublicUsername(user3) != null) {
                                        x90Var.H(i15, i16, "@" + UserObject.getPublicUsername(user3) + " ", false);
                                    } else {
                                        SpannableString spannableString2 = new SpannableString(s3.c.l(UserObject.getFirstName(user3, false), " "));
                                        StringBuilder sb3 = new StringBuilder("");
                                        aa0Var = aa0Var2;
                                        sb3.append(user3.f22527id);
                                        spannableString2.setSpan(new u41(sb3.toString(), 3, null), 0, spannableString2.length(), 33);
                                        x90Var.H(i15, i16, spannableString2, false);
                                    }
                                }
                                if (objJ instanceof TLRPC.BotInlineResult) {
                                    botInlineResult = (TLRPC.BotInlineResult) objJ;
                                    if ((botInlineResult.type.equals("photo") || (botInlineResult.photo == null && botInlineResult.content == null)) && ((!botInlineResult.type.equals("gif") || (botInlineResult.document == null && botInlineResult.content == null)) && (!botInlineResult.type.equals("video") || botInlineResult.document == null))) {
                                        x90Var.c(botInlineResult, true, 0);
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(aa0Var.getAdapter().N);
                                        aa0Var.L = arrayList4;
                                        PhotoViewer.t1().K2(null, aa0Var.h, aa0Var.f26699a);
                                        PhotoViewer.t1().f2(arrayList4, aa0Var.getAdapter().M(i14), 3, false, aa0Var.M, null);
                                    }
                                }
                            } else {
                                String publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) objJ);
                                if (publicUsername != null) {
                                    x90Var.H(i15, i16, a9.p.m("@", publicUsername, " "), false);
                                }
                            }
                            aa0Var = aa0Var2;
                            if (objJ instanceof TLRPC.BotInlineResult) {
                                botInlineResult = (TLRPC.BotInlineResult) objJ;
                                if (botInlineResult.type.equals("photo")) {
                                    x90Var.c(botInlineResult, true, 0);
                                } else {
                                    x90Var.c(botInlineResult, true, 0);
                                }
                                ArrayList arrayList5 = new ArrayList(aa0Var.getAdapter().N);
                                aa0Var.L = arrayList5;
                                PhotoViewer.t1().K2(null, aa0Var.h, aa0Var.f26699a);
                                PhotoViewer.t1().f2(arrayList5, aa0Var.getAdapter().M(i14), 3, false, aa0Var.M, null);
                            }
                        } else {
                            x90Var.H(i15, i16, a9.p.p(new StringBuilder(), aa0Var2.getAdapter().B, " "), false);
                        }
                    }
                } else {
                    aa0Var2.getClass();
                }
                break;
            case 15:
                cg0.p((cg0) this.f2854b, (Context) this.f2855c, view, i10);
                break;
            case 16:
                m31.S((m31) this.f2854b, (c6) this.f2855c, i10);
                break;
            case 17:
                wu wuVar = (wu) this.f2854b;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f2855c;
                zo zoVar = (zo) wuVar.f44190c.d.get(i10);
                f6 f6VarJ = zoVar.f35316a.j(wuVar.v);
                of.b bVar = zoVar.f35316a.f22782c;
                if (bVar == null) {
                    str5 = null;
                } else {
                    str5 = bVar.f19442b;
                    if (str5 == null) {
                        str5 = bVar.f19441a;
                    }
                }
                if (!str5.equals("🏠")) {
                    of.b bVar2 = zoVar.f35316a.f22782c;
                    if (bVar2 == null) {
                        str6 = null;
                    } else {
                        str6 = bVar2.f19442b;
                        if (str6 == null) {
                            str6 = bVar2.f19441a;
                        }
                    }
                    size = str6.equals("🎨") ? ((a4) zoVar.f35316a.f22784f.get(wuVar.v)).f22713e : -1;
                }
                if (f6VarJ == null) {
                    TLRPC.TL_theme tL_theme = ((a4) zoVar.f35316a.f22784f.get(wuVar.v)).f22711b;
                    f6 f6VarN0 = g6.N0(g6.q0(tL_theme.settings.get(((a4) zoVar.f35316a.f22784f.get(wuVar.v)).d)));
                    if (f6VarN0 != null) {
                        e6 e6VarF = (e6) f6VarN0.Y.get(tL_theme.f22517id);
                        if (e6VarF == null) {
                            e6VarF = f6VarN0.f(tL_theme, n2Var2.getCurrentAccount(), 0);
                        }
                        size = e6VarF.f22883a;
                        f6VarN0.u(size);
                    }
                    f6VarJ = f6VarN0;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6VarJ, Boolean.FALSE, null, Integer.valueOf(size));
                wuVar.f44194r = i10;
                int i17 = 0;
                while (i17 < wuVar.f44190c.d.size()) {
                    ((zo) wuVar.f44190c.d.get(i17)).d = i17 == wuVar.f44194r;
                    i17++;
                }
                wuVar.f44190c.E(wuVar.f44194r);
                for (int i18 = 0; i18 < wuVar.f44188a.getChildCount(); i18++) {
                    b11 b11Var = (b11) wuVar.f44188a.getChildAt(i18);
                    if (b11Var != view && (up0Var = b11Var.F) != null) {
                        AndroidUtilities.cancelRunOnUIThread(up0Var);
                        b11Var.F.run();
                    }
                }
                ((b11) view).d();
                if (f6VarJ != null) {
                    SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                    editorEdit.putString((wuVar.f44195s == 1 || f6VarJ.q()) ? "lastDarkTheme" : "lastDayTheme", f6VarJ.m());
                    editorEdit.commit();
                }
                g6.F1(n2Var2);
                break;
            case 18:
                py.U((py) this.f2854b, (Context) this.f2855c, i10);
                break;
            case 19:
                o60.U((o60) this.f2854b, (Context) this.f2855c, view, i10);
                break;
            case 20:
                tc0 tc0Var = (tc0) this.f2854b;
                org.telegram.ui.ActionBar.z zVar = (org.telegram.ui.ActionBar.z) this.f2855c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenueI = tc0Var.S.I(i10);
                if (tL_messageMediaVenueI != null && tL_messageMediaVenueI.icon != null && tc0Var.C0 == 8 && tc0Var.E != null) {
                    tc0Var.f42889y0 = true;
                    zVar.j(true);
                    if ("pin".equals(tL_messageMediaVenueI.icon)) {
                        maxZoomLevel = tc0Var.E.getMaxZoomLevel();
                        f10 = 4.0f;
                    } else {
                        maxZoomLevel = tc0Var.E.getMaxZoomLevel();
                        f10 = 9.0f;
                    }
                    float f11 = maxZoomLevel - f10;
                    IMapsProvider.IMap iMap = tc0Var.E;
                    IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                    TLRPC.GeoPoint geoPoint = tL_messageMediaVenueI.geo;
                    iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f11));
                    Location location = tc0Var.f42881t0;
                    if (location != null) {
                        location.setLatitude(tL_messageMediaVenueI.geo.lat);
                        tc0Var.f42881t0.setLongitude(tL_messageMediaVenueI.geo._long);
                    }
                    tc0Var.P.L(tc0Var.f42881t0);
                    break;
                } else if (tL_messageMediaVenueI != null && (oc0Var = tc0Var.B0) != null) {
                    oc0Var.d(tL_messageMediaVenueI, tc0Var.C0, true, 0, 0L);
                    tc0Var.finishFragment();
                    break;
                }
                break;
            case 21:
                kh0 kh0Var = (kh0) this.f2854b;
                Context context2 = (Context) this.f2855c;
                HashMap map = kh0Var.f39747g0;
                if (i10 == kh0Var.M) {
                    TLRPC.User user4 = (TLRPC.User) map.get(Long.valueOf(kh0Var.f39743e.admin_id));
                    if (user4 != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("user_id", user4.f22527id);
                        MessagesController.getInstance(UserConfig.selectedAccount).putUser(user4, false);
                        kh0Var.presentFragment(new ProfileActivity(bundle3, null));
                    }
                    break;
                } else if (i10 == kh0Var.f39760x) {
                    fb0 fb0Var = new fb0(0, kh0Var.f39753n);
                    fb0Var.P = kh0Var.f39755o0;
                    kh0Var.presentFragment(fb0Var);
                    break;
                } else {
                    int i19 = kh0Var.f39761y;
                    if (i10 >= i19 && i10 < kh0Var.A) {
                        f60 f60Var = new f60(context2, (TLRPC.TL_chatInviteExported) kh0Var.f39744e0.get(i10 - i19), kh0Var.d, map, kh0Var, kh0Var.f39753n, false, kh0Var.h);
                        kh0Var.f39748h0 = f60Var;
                        f60Var.f28280g0 = kh0Var.f39752l0;
                        f60Var.show();
                        break;
                    } else {
                        int i20 = kh0Var.D;
                        if (i10 >= i20 && i10 < kh0Var.E) {
                            f60 f60Var2 = new f60(context2, (TLRPC.TL_chatInviteExported) kh0Var.f39746f0.get(i10 - i20), kh0Var.d, map, kh0Var, kh0Var.f39753n, false, kh0Var.h);
                            kh0Var.f39748h0 = f60Var2;
                            f60Var2.show();
                            break;
                        } else if (i10 != kh0Var.J) {
                            int i21 = kh0Var.Q;
                            if (i10 >= i21 && i10 < kh0Var.R) {
                                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) kh0Var.f39749i0.get(i10 - i21);
                                if (map.containsKey(Long.valueOf(tL_chatAdminWithInvites.admin_id))) {
                                    kh0Var.getMessagesController().putUser((TLRPC.User) map.get(Long.valueOf(tL_chatAdminWithInvites.admin_id)), false);
                                }
                                kh0 kh0Var2 = new kh0(kh0Var.f39753n, tL_chatAdminWithInvites.admin_id, tL_chatAdminWithInvites.invites_count);
                                kh0Var2.g0(kh0Var.d, null);
                                kh0Var.presentFragment(kh0Var2);
                                break;
                            }
                        } else if (!kh0Var.Y) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kh0Var.getParentActivity());
                            alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.DeleteAllRevokedLinks);
                            alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.DeleteAllRevokedLinkHelp);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new wg0(kh0Var));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            kh0Var.showDialog(alertDialog$Builder2.f22702a);
                            break;
                        }
                    }
                }
                break;
            case 22:
                kk0.U((kk0) this.f2854b, (Context) this.f2855c, view, i10);
                break;
            case 23:
                PrivacySettingsActivity.V((PrivacySettingsActivity) this.f2854b, (Context) this.f2855c, view, i10);
                break;
            default:
                UsersSelectActivity.U((UsersSelectActivity) this.f2854b, (Context) this.f2855c, view, i10);
                break;
        }
    }
}
