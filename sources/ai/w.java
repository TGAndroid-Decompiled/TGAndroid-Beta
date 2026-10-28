package ai;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.x1;
import di.s6;
import fi.g6;
import fi.i6;
import fi.ia;
import java.io.File;
import java.util.ArrayList;
import li.b2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.Components.xr0;
import org.telegram.ui.Components.z71;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a80;
import org.telegram.ui.cq0;
import org.telegram.ui.d80;
import org.telegram.ui.ey;
import org.telegram.ui.gq0;
import org.telegram.ui.jm0;
import org.telegram.ui.kh1;
import org.telegram.ui.kn0;
import org.telegram.ui.qg0;
import org.telegram.ui.rg0;
import org.telegram.ui.tq0;
import org.telegram.ui.up0;
import org.telegram.ui.vg1;
import org.telegram.ui.w40;
import org.telegram.ui.wn;
import org.telegram.ui.yj0;
public final class w implements View.OnClickListener {
    public final int f1960a;
    public final int f1961b;
    public final Object f1962c;

    public w(Object obj, int i10, int i11) {
        this.f1960a = i11;
        this.f1962c = obj;
        this.f1961b = i10;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        boolean z10;
        boolean z11;
        String string;
        int i10;
        int i11;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z12;
        String formatPluralString;
        String formatPluralString2;
        int i12;
        int i13;
        boolean z13;
        int i14 = this.f1960a;
        int i15 = 1;
        char c10 = 1;
        boolean z14 = true;
        int i16 = this.f1961b;
        Object obj = this.f1962c;
        switch (i14) {
            case 0:
                x0 x0Var = ((x) obj).h;
                s4.t tVar = x0Var.d;
                ArrayList arrayList = x0Var.f1974n;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    x0Var.v = true;
                    x0Var.h.a(i16, true);
                    int i17 = ((u) arrayList.get(i16)).d;
                    int L0 = tVar.L0();
                    if ((tVar.m(i17) == null && Math.abs(i17 - L0) > x0Var.f1975r * 9) || !SharedConfig.animationsEnabled()) {
                        x0Var.f1972c.C0();
                        ql0 ql0Var = x0Var.f1973f;
                        if (L0 < i17) {
                            i15 = 0;
                        }
                        ql0Var.f31934b = i15;
                        ql0Var.c(i17, 0, false, false);
                        return;
                    }
                    s4.d0 d0Var = new s4.d0(x0Var.getContext());
                    d0Var.f47715a = ((u) arrayList.get(i16)).d;
                    tVar.w0(d0Var);
                    return;
                }
                return;
            case 1:
                bi.w1 w1Var = ((x1) obj).f5651j0;
                int i18 = bi.w1.v;
                w1Var.a(i16);
                return;
            case 2:
                ((bi.w1) obj).a(i16);
                return;
            case 3:
                ia iaVar = (ia) obj;
                if (iaVar.e.contains(Integer.valueOf(i16))) {
                    if (iaVar.e.size() > 1) {
                        iaVar.e.remove(Integer.valueOf(i16));
                    } else {
                        return;
                    }
                } else {
                    iaVar.e.add(Integer.valueOf(i16));
                }
                AndroidUtilities.forEachViews((RecyclerView) iaVar.f11106b, (Utilities.Callback<View>) new i(iaVar, 20));
                return;
            case 4:
                i6 i6Var = ((g6) obj).f10906b;
                if (i6Var.f11001r && (callback = i6Var.f10999f) != null) {
                    callback.run(Integer.valueOf(i16));
                    return;
                }
                return;
            case 5:
                View.OnClickListener onClickListener = ((lh.e) obj).f17028b[i16];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 6:
                lh.a aVar = ((lh.h) obj).h;
                if (aVar != null) {
                    aVar.i(i16);
                    return;
                }
                return;
            case 7:
                ((b2) obj).P.e4(i16);
                return;
            case 8:
                ((s3) obj).f25392c.run(Integer.valueOf(i16));
                return;
            case 9:
                ((wn) obj).S9(i16);
                return;
            case 10:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            g0Var.f28341f0 = !g0Var.f28341f0;
                        }
                    } else {
                        g0Var.f28340e0 = !g0Var.f28340e0;
                    }
                } else {
                    g0Var.f28339d0 = !g0Var.f28339d0;
                }
                g0Var.X.O(true);
                g0Var.s();
                return;
            case 11:
                boolean[] zArr = (boolean[]) obj;
                boolean z15 = !zArr[i16];
                zArr[i16] = z15;
                ((y1) view).c(z15, true);
                return;
            case 12:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z16 = ChatAttachAlertPhotoLayout.f26017q1;
                chatAttachAlertPhotoLayout.f30254b.f32974a1.getActionBarMenuOnItemClick().b(i16);
                chatAttachAlertPhotoLayout.f26061w.U(null, null);
                return;
            case 13:
                ((w40) obj).f34435b.x(i16, true);
                return;
            case 14:
                w40 w40Var = ((v30) obj).f33550c;
                w40Var.n(i16);
                w40Var.dismiss();
                return;
            case 15:
                ((ua0) obj).R.e1(i16 + 8);
                return;
            case 16:
                xd0 xd0Var = (xd0) obj;
                if (xd0Var.e.getAdapter() instanceof vd0) {
                    sz szVar = ((ky) ((vd0) xd0Var.e.getAdapter())).f30050c;
                    if ((i16 == 1 || i16 == 2) && szVar.f32776w1) {
                        if (i16 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        szVar.Q(true, false, z10);
                        return;
                    } else if (i16 == 0 && szVar.f32772v1) {
                        szVar.Q(true, true, false);
                        return;
                    }
                }
                xd0Var.e.x(i16, false);
                return;
            case 17:
                s4 s4Var = (s4) obj;
                EditTextBoldCursor editTextBoldCursor = s4Var.f35400c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                s4Var.d.run(Integer.valueOf(i16), editTextBoldCursor.getText().toString());
                s4Var.dismiss();
                return;
            case 18:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i16, scrollSlidingTextTabStrip.f26286a.indexOfChild(view));
                return;
            case 19:
                final bw0 bw0Var = (bw0) obj;
                vs0 vs0Var = bw0Var.W;
                mv0 mv0Var = bw0Var.T;
                u6 u6Var = bw0Var.H1;
                long j10 = bw0Var.l1;
                SparseArray[] sparseArrayArr = bw0Var.f26929b1;
                r2 r2Var = bw0Var.f26992x1;
                if (i16 == 101) {
                    if (!bw0.w0(bw0Var.getSelectedTab()) && bw0Var.getSelectedTab() != 13) {
                        if (bw0Var.getSelectedTab() == 11) {
                            SavedMessagesController savedMessagesController = r2Var.getMessagesController().getSavedMessagesController();
                            final ArrayList arrayList2 = new ArrayList();
                            for (int i19 = 0; i19 < savedMessagesController.allDialogs.size(); i19++) {
                                long j11 = savedMessagesController.allDialogs.get(i19).dialogId;
                                if (mv0Var.f30641w.contains(Long.valueOf(j11))) {
                                    arrayList2.add(Long.valueOf(j11));
                                }
                            }
                            String str = "";
                            if (!arrayList2.isEmpty()) {
                                Long l4 = (Long) arrayList2.get(0);
                                long longValue = l4.longValue();
                                if (longValue == r2Var.getUserConfig().getClientUserId()) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                int i20 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                                z12 = z13;
                                if (i20 < 0) {
                                    TLRPC.Chat chat2 = r2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                                    z12 = z13;
                                    if (chat2 != null) {
                                        str = chat2.title;
                                        z12 = z13;
                                    }
                                } else if (i20 >= 0) {
                                    TLRPC.User user2 = r2Var.getMessagesController().getUser(l4);
                                    z12 = z13;
                                    if (user2 != null) {
                                        if (UserObject.isAnonymous(user2)) {
                                            str = LocaleController.getString(R.string.AnonymousForward);
                                            z12 = z13;
                                        } else {
                                            str = UserObject.getUserName(user2);
                                            z12 = z13;
                                        }
                                    }
                                }
                            } else {
                                z12 = false;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bw0Var.getContext(), 0, u6Var);
                            if (arrayList2.size() == 1) {
                                if (z12) {
                                    i13 = R.string.ClearHistoryMyNotesTitle;
                                } else {
                                    i13 = R.string.ClearHistoryTitleSingle2;
                                }
                                formatPluralString = LocaleController.formatString(i13, str);
                            } else {
                                formatPluralString = LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList2.size(), new Object[0]);
                            }
                            e2 e2Var = alertDialog$Builder.f22369a;
                            e2Var.R = formatPluralString;
                            if (arrayList2.size() == 1) {
                                if (z12) {
                                    i12 = R.string.ClearHistoryMyNotesMessage;
                                } else {
                                    i12 = R.string.ClearHistoryMessageSingle;
                                }
                                formatPluralString2 = LocaleController.formatString(i12, str);
                            } else {
                                formatPluralString2 = LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList2.size(), new Object[0]);
                            }
                            e2Var.T = formatPluralString2;
                            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i21) {
                                    switch (r3) {
                                        case 0:
                                            bw0 bw0Var2 = bw0Var;
                                            org.telegram.ui.ActionBar.r2 r2Var2 = bw0Var2.f26992x1;
                                            di.h7 storiesController = r2Var2.getMessagesController().getStoriesController();
                                            long j12 = bw0Var2.l1;
                                            ArrayList arrayList3 = arrayList2;
                                            storiesController.s(j12, arrayList3);
                                            wc.b0(r2Var2).R(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList3.size(), new Object[0])).j();
                                            bw0Var2.S(false);
                                            return;
                                        default:
                                            bw0 bw0Var3 = bw0Var;
                                            bw0Var3.getClass();
                                            int i22 = 0;
                                            while (true) {
                                                ArrayList arrayList4 = arrayList2;
                                                if (i22 < arrayList4.size()) {
                                                    bw0Var3.f26992x1.getMessagesController().deleteSavedDialog(((Long) arrayList4.get(i22)).longValue());
                                                    i22++;
                                                } else {
                                                    bw0Var3.S(true);
                                                    return;
                                                }
                                            }
                                    }
                                }
                            });
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            r2Var.showDialog(e2Var);
                            TextView textView = (TextView) e2Var.d(-1);
                            if (textView != null) {
                                f7.V(textView, y6.f23599q7, null);
                                return;
                            }
                            return;
                        }
                        if (DialogObject.isEncryptedDialog(j10)) {
                            encryptedChat = org.telegram.messenger.t.m(r2Var.getMessagesController(), j10);
                            user = null;
                            chat = null;
                        } else if (DialogObject.isUserDialog(j10)) {
                            user = r2Var.getMessagesController().getUser(Long.valueOf(j10));
                            chat = null;
                            encryptedChat = null;
                        } else {
                            chat = r2Var.getMessagesController().getChat(Long.valueOf(-j10));
                            user = null;
                            encryptedChat = null;
                        }
                        g5.y(r2Var, user, chat, encryptedChat, null, bw0Var.f26939e1, null, bw0Var.f26929b1, null, 0, 0, null, new wr0(bw0Var, 12), null, bw0Var.H1);
                        return;
                    } else if (sparseArrayArr[0] != null) {
                        if (bw0Var.y0() && vs0Var != null && vs0Var.getCurrentList() != null) {
                            s6 currentList = vs0Var.getCurrentList();
                            ArrayList arrayList3 = new ArrayList();
                            for (int i21 = 0; i21 < sparseArrayArr[0].size(); i21++) {
                                TL_stories.StoryItem storyItem = ((MessageObject) sparseArrayArr[0].valueAt(i21)).storyItem;
                                if (storyItem != null) {
                                    arrayList3.add(storyItem.media);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bw0Var.getContext(), 0, u6Var);
                                if (arrayList3.size() > 1) {
                                    i11 = R.string.DeleteBotPreviewsTitle;
                                } else {
                                    i11 = R.string.DeleteBotPreviewTitle;
                                }
                                String string2 = LocaleController.getString(i11);
                                e2 e2Var2 = alertDialog$Builder2.f22369a;
                                e2Var2.R = string2;
                                e2Var2.T = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList3.size(), new Object[0]);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new qy(bw0Var, currentList, arrayList3, 3));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new rd0(20));
                                e2Var2.show();
                                e2Var2.i();
                                return;
                            }
                            return;
                        }
                        final ArrayList arrayList4 = new ArrayList();
                        for (int i22 = 0; i22 < sparseArrayArr[0].size(); i22++) {
                            TL_stories.StoryItem storyItem2 = ((MessageObject) sparseArrayArr[0].valueAt(i22)).storyItem;
                            if (storyItem2 != null) {
                                arrayList4.add(storyItem2);
                            }
                        }
                        if (!arrayList4.isEmpty()) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(bw0Var.getContext(), 0, u6Var);
                            if (arrayList4.size() > 1) {
                                i10 = R.string.DeleteStoriesTitle;
                            } else {
                                i10 = R.string.DeleteStoryTitle;
                            }
                            String string3 = LocaleController.getString(i10);
                            e2 e2Var3 = alertDialog$Builder3.f22369a;
                            e2Var3.R = string3;
                            e2Var3.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList4.size(), new Object[0]);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i212) {
                                    switch (r3) {
                                        case 0:
                                            bw0 bw0Var2 = bw0Var;
                                            org.telegram.ui.ActionBar.r2 r2Var2 = bw0Var2.f26992x1;
                                            di.h7 storiesController = r2Var2.getMessagesController().getStoriesController();
                                            long j12 = bw0Var2.l1;
                                            ArrayList arrayList32 = arrayList4;
                                            storiesController.s(j12, arrayList32);
                                            wc.b0(r2Var2).R(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList32.size(), new Object[0])).j();
                                            bw0Var2.S(false);
                                            return;
                                        default:
                                            bw0 bw0Var3 = bw0Var;
                                            bw0Var3.getClass();
                                            int i222 = 0;
                                            while (true) {
                                                ArrayList arrayList42 = arrayList4;
                                                if (i222 < arrayList42.size()) {
                                                    bw0Var3.f26992x1.getMessagesController().deleteSavedDialog(((Long) arrayList42.get(i222)).longValue());
                                                    i222++;
                                                } else {
                                                    bw0Var3.S(true);
                                                    return;
                                                }
                                            }
                                    }
                                }
                            });
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new rd0(21));
                            e2Var3.show();
                            e2Var3.i();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (i16 == 100) {
                    if (bw0Var.f26946g1 != null && r2Var.getMessagesController().isUserNoForwards(bw0Var.f26946g1)) {
                        t40 t40Var = bw0Var.G1;
                        if (t40Var != null) {
                            t40Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                            bw0Var.G1.f(view, true);
                            return;
                        }
                        return;
                    }
                    if (bw0Var.f26943f1 != null) {
                        TLRPC.Chat chat3 = r2Var.getMessagesController().getChat(Long.valueOf(bw0Var.f26943f1.f22029id));
                        if (r2Var.getMessagesController().isChatNoForwards(chat3)) {
                            t40 t40Var2 = bw0Var.G1;
                            if (t40Var2 != null) {
                                if (ChatObject.isChannel(chat3) && !chat3.megagroup) {
                                    string = LocaleController.getString(R.string.ForwardsRestrictedInfoChannel);
                                } else {
                                    string = LocaleController.getString(R.string.ForwardsRestrictedInfoGroup);
                                }
                                t40Var2.setText(string);
                                bw0Var.G1.f(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (bw0Var.r0()) {
                        t40 t40Var3 = bw0Var.G1;
                        if (t40Var3 != null) {
                            t40Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                            bw0Var.G1.f(view, true);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 3);
                    ey eyVar = new ey(bundle);
                    eyVar.C2 = new xr0(bw0Var);
                    r2Var.presentFragment(eyVar);
                    return;
                } else if (i16 == 102) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                        if (sparseArrayArr[0].size() == 1) {
                            c10 = 0;
                        }
                        MessageObject messageObject = (MessageObject) sparseArrayArr[c10].valueAt(0);
                        Bundle bundle2 = new Bundle();
                        long dialogId = messageObject.getDialogId();
                        if (DialogObject.isEncryptedDialog(dialogId)) {
                            bundle2.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                        } else if (DialogObject.isUserDialog(dialogId)) {
                            bundle2.putLong("user_id", dialogId);
                        } else {
                            TLRPC.Chat chat4 = r2Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                            if (chat4 != null && chat4.migrated_to != null) {
                                bundle2.putLong("migrated_to", dialogId);
                                dialogId = -chat4.migrated_to.channel_id;
                            }
                            bundle2.putLong("chat_id", -dialogId);
                        }
                        bundle2.putInt("message_id", messageObject.getId());
                        bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                        wn wnVar = new wn(bundle2);
                        wnVar.f45066b8 = messageObject.getId();
                        long j12 = bw0Var.F;
                        if (j12 != 0) {
                            pg.d.a(wnVar, MessagesStorage.TopicKey.of(dialogId, j12));
                            bundle2.putInt("message_id", messageObject.getId());
                        }
                        r2Var.presentFragment(wnVar, false);
                        return;
                    }
                    return;
                } else if (i16 == 103 || i16 == 104) {
                    if (bw0Var.getClosestTab() == 8) {
                        iu0 iu0Var = bw0Var.f26938e0;
                        if (iu0Var != null && iu0Var.f35173s != null) {
                            ArrayList arrayList5 = new ArrayList();
                            for (int i23 = 0; i23 < sparseArrayArr[0].size(); i23++) {
                                arrayList5.add(Integer.valueOf(((MessageObject) sparseArrayArr[0].valueAt(i23)).getId()));
                            }
                            if (i16 != 103) {
                                z14 = false;
                            }
                            bw0Var.Z0(arrayList5, z14);
                            bw0Var.S(false);
                            return;
                        }
                        return;
                    }
                    SavedMessagesController savedMessagesController2 = r2Var.getMessagesController().getSavedMessagesController();
                    ArrayList<Long> arrayList6 = new ArrayList<>();
                    for (int i24 = 0; i24 < savedMessagesController2.allDialogs.size(); i24++) {
                        long j13 = savedMessagesController2.allDialogs.get(i24).dialogId;
                        if (mv0Var.f30641w.contains(Long.valueOf(j13))) {
                            arrayList6.add(Long.valueOf(j13));
                        }
                    }
                    if (i16 == 103) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!savedMessagesController2.updatePinned(arrayList6, z11, true)) {
                        r2Var.showDialog(new tg.j0(33, r2Var.getCurrentAccount(), bw0Var.getContext(), r2Var, null));
                    } else {
                        int i25 = 0;
                        while (true) {
                            uu0[] uu0VarArr = bw0Var.m0;
                            if (i25 < uu0VarArr.length) {
                                uu0 uu0Var = uu0VarArr[i25];
                                if (uu0Var.E == 11) {
                                    uu0Var.f33471w.h1(0, 0);
                                } else {
                                    i25++;
                                }
                            }
                        }
                    }
                    bw0Var.S(true);
                    return;
                } else {
                    return;
                }
            case 20:
                z71 z71Var = (z71) obj;
                int i26 = z71Var.f35287b.f26250i.f31839q;
                if (i26 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    z71Var.updateAppUpdateViews(i16, true);
                    return;
                } else if (i26 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    z71Var.updateAppUpdateViews(i16, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", z71Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 21:
                ((org.telegram.ui.Components.voip.v0) obj).f34246b.x(i16, true);
                return;
            case 22:
                kh1 kh1Var = (kh1) obj;
                if (kh1Var.U == null && view.getAlpha() != 0.0f) {
                    kh1Var.c(i16, true);
                    return;
                }
                return;
            case 23:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i16);
                return;
            case 24:
                d80 d80Var = (d80) obj;
                d80Var.Q.dismiss();
                int i27 = d80Var.f38538c0;
                if (i27 >= 0) {
                    d80Var.f38539d0.setKeepMedia(i27, i16);
                    a80 a80Var = d80Var.f38540e0;
                    if (a80Var != null) {
                        a80Var.a(i16);
                        return;
                    }
                    return;
                }
                a80 a80Var2 = d80Var.f38540e0;
                if (a80Var2 != null) {
                    a80Var2.a(i16);
                    return;
                }
                return;
            case 25:
                rg0 rg0Var = (rg0) obj;
                ValueAnimator valueAnimator = rg0Var.f45001c.S;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    vg1 vg1Var = rg0Var.f45001c;
                    if (!vg1Var.H) {
                        if (vg1Var.getCurrentPosition() == i16) {
                            r2 X = rg0Var.X();
                            if (X instanceof qg0) {
                                ((qg0) X).s();
                                return;
                            }
                            return;
                        }
                        rg0Var.j0(i16, true);
                        rg0Var.f45001c.E(i16);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ((yj0) obj).d.v.E(i16);
                return;
            case 27:
                kn0 kn0Var = (kn0) obj;
                jm0 jm0Var = kn0Var.D1;
                kn0Var.S0 = i16;
                if (i16 == 1) {
                    kn0Var.f40855i0 = kn0Var.f40851g0;
                } else if (i16 == 4) {
                    kn0Var.f40855i0 = kn0Var.f40853h0;
                } else if (i16 == 2) {
                    kn0Var.f40855i0 = kn0Var.f40846e0;
                } else if (i16 == 3) {
                    kn0Var.f40855i0 = kn0Var.f40849f0;
                } else {
                    kn0Var.f40855i0 = kn0Var.f40844d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.v1().N2(null, kn0Var, null);
                if (i16 == 1) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(kn0Var.f40858j1);
                    PhotoViewer.v1().f2(arrayList7, 0, jm0Var);
                    return;
                } else if (i16 == 2) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(kn0Var.l1);
                    PhotoViewer.v1().f2(arrayList8, 0, jm0Var);
                    return;
                } else if (i16 == 3) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(kn0Var.f40862m1);
                    PhotoViewer.v1().f2(arrayList9, 0, jm0Var);
                    return;
                } else if (i16 == 0) {
                    PhotoViewer v12 = PhotoViewer.v1();
                    ArrayList arrayList10 = kn0Var.f40856i1;
                    v12.f2(arrayList10, arrayList10.indexOf(secureDocument), jm0Var);
                    return;
                } else {
                    PhotoViewer v13 = PhotoViewer.v1();
                    ArrayList arrayList11 = kn0Var.f40860k1;
                    v13.f2(arrayList11, arrayList11.indexOf(secureDocument), jm0Var);
                    return;
                }
            case 28:
                cq0 cq0Var = (cq0) obj;
                org.telegram.ui.ActionBar.o1 o1Var = cq0Var.I;
                if (o1Var != null && o1Var.isShowing()) {
                    cq0Var.I.d(true);
                }
                if (i16 == 0) {
                    g5.K(cq0Var.getParentActivity(), cq0Var.F.a(), new up0(cq0Var, 2));
                    return;
                }
                cq0Var.W(cq0Var.f38433b, cq0Var.f38434c, true, 0);
                cq0Var.finishFragment();
                return;
            default:
                tq0 tq0Var = (tq0) obj;
                org.telegram.ui.ActionBar.o1 o1Var2 = tq0Var.m0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    tq0Var.m0.d(true);
                }
                if (i16 == 0) {
                    g5.K(tq0Var.getParentActivity(), tq0Var.U.a(), new gq0(tq0Var, 1));
                    return;
                } else {
                    tq0Var.f0(0, true);
                    return;
                }
        }
    }
}
