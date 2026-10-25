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
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.us0;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.Components.y71;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.aq0;
import org.telegram.ui.b80;
import org.telegram.ui.cy;
import org.telegram.ui.eq0;
import org.telegram.ui.hm0;
import org.telegram.ui.ih1;
import org.telegram.ui.in0;
import org.telegram.ui.og0;
import org.telegram.ui.pg0;
import org.telegram.ui.rq0;
import org.telegram.ui.sp0;
import org.telegram.ui.tg1;
import org.telegram.ui.u40;
import org.telegram.ui.un;
import org.telegram.ui.wj0;
import org.telegram.ui.y70;
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
                        pl0 pl0Var = x0Var.f1973f;
                        if (L0 < i17) {
                            i15 = 0;
                        }
                        pl0Var.f31595b = i15;
                        pl0Var.c(i17, 0, false, false);
                        return;
                    }
                    s4.d0 d0Var = new s4.d0(x0Var.getContext());
                    d0Var.f47677a = ((u) arrayList.get(i16)).d;
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
                AndroidUtilities.forEachViews((RecyclerView) iaVar.f11107b, (Utilities.Callback<View>) new i(iaVar, 20));
                return;
            case 4:
                i6 i6Var = ((g6) obj).f10907b;
                if (i6Var.f11002r && (callback = i6Var.f11000f) != null) {
                    callback.run(Integer.valueOf(i16));
                    return;
                }
                return;
            case 5:
                View.OnClickListener onClickListener = ((lh.e) obj).f17029b[i16];
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
                ((s3) obj).f25388c.run(Integer.valueOf(i16));
                return;
            case 9:
                ((un) obj).P9(i16);
                return;
            case 10:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            g0Var.f28352f0 = !g0Var.f28352f0;
                        }
                    } else {
                        g0Var.f28351e0 = !g0Var.f28351e0;
                    }
                } else {
                    g0Var.f28350d0 = !g0Var.f28350d0;
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
                boolean z16 = ChatAttachAlertPhotoLayout.f26013q1;
                chatAttachAlertPhotoLayout.f30213b.f33002a1.getActionBarMenuOnItemClick().b(i16);
                chatAttachAlertPhotoLayout.f26057w.U(null, null);
                return;
            case 13:
                ((u40) obj).f34349b.x(i16, true);
                return;
            case 14:
                u40 u40Var = ((v30) obj).f33558c;
                u40Var.n(i16);
                u40Var.dismiss();
                return;
            case 15:
                ((ta0) obj).R.e1(i16 + 8);
                return;
            case 16:
                wd0 wd0Var = (wd0) obj;
                if (wd0Var.e.getAdapter() instanceof ud0) {
                    sz szVar = ((ky) ((ud0) wd0Var.e.getAdapter())).f29999c;
                    if ((i16 == 1 || i16 == 2) && szVar.f32779w1) {
                        if (i16 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        szVar.P(true, false, z10);
                        return;
                    } else if (i16 == 0 && szVar.f32775v1) {
                        szVar.P(true, true, false);
                        return;
                    }
                }
                wd0Var.e.x(i16, false);
                return;
            case 17:
                s4 s4Var = (s4) obj;
                EditTextBoldCursor editTextBoldCursor = s4Var.f35080c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                s4Var.d.run(Integer.valueOf(i16), editTextBoldCursor.getText().toString());
                s4Var.dismiss();
                return;
            case 18:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i16, scrollSlidingTextTabStrip.f26282a.indexOfChild(view));
                return;
            case 19:
                final aw0 aw0Var = (aw0) obj;
                us0 us0Var = aw0Var.W;
                lv0 lv0Var = aw0Var.T;
                u6 u6Var = aw0Var.H1;
                long j10 = aw0Var.l1;
                SparseArray[] sparseArrayArr = aw0Var.f26639b1;
                r2 r2Var = aw0Var.f26702x1;
                if (i16 == 101) {
                    if (!aw0.w0(aw0Var.getSelectedTab()) && aw0Var.getSelectedTab() != 13) {
                        if (aw0Var.getSelectedTab() == 11) {
                            SavedMessagesController savedMessagesController = r2Var.getMessagesController().getSavedMessagesController();
                            final ArrayList arrayList2 = new ArrayList();
                            for (int i19 = 0; i19 < savedMessagesController.allDialogs.size(); i19++) {
                                long j11 = savedMessagesController.allDialogs.get(i19).dialogId;
                                if (lv0Var.f30296w.contains(Long.valueOf(j11))) {
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
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(aw0Var.getContext(), 0, u6Var);
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
                            e2 e2Var = alertDialog$Builder.f22366a;
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
                                            aw0 aw0Var2 = aw0Var;
                                            org.telegram.ui.ActionBar.r2 r2Var2 = aw0Var2.f26702x1;
                                            di.h7 storiesController = r2Var2.getMessagesController().getStoriesController();
                                            long j12 = aw0Var2.l1;
                                            ArrayList arrayList3 = arrayList2;
                                            storiesController.s(j12, arrayList3);
                                            wc.b0(r2Var2).R(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList3.size(), new Object[0])).j();
                                            aw0Var2.S(false);
                                            return;
                                        default:
                                            aw0 aw0Var3 = aw0Var;
                                            aw0Var3.getClass();
                                            int i22 = 0;
                                            while (true) {
                                                ArrayList arrayList4 = arrayList2;
                                                if (i22 < arrayList4.size()) {
                                                    aw0Var3.f26702x1.getMessagesController().deleteSavedDialog(((Long) arrayList4.get(i22)).longValue());
                                                    i22++;
                                                } else {
                                                    aw0Var3.S(true);
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
                                f7.V(textView, y6.f23596q7, null);
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
                        g5.y(r2Var, user, chat, encryptedChat, null, aw0Var.f26649e1, null, aw0Var.f26639b1, null, 0, 0, null, new vr0(aw0Var, 12), null, aw0Var.H1);
                        return;
                    } else if (sparseArrayArr[0] != null) {
                        if (aw0Var.y0() && us0Var != null && us0Var.getCurrentList() != null) {
                            s6 currentList = us0Var.getCurrentList();
                            ArrayList arrayList3 = new ArrayList();
                            for (int i21 = 0; i21 < sparseArrayArr[0].size(); i21++) {
                                TL_stories.StoryItem storyItem = ((MessageObject) sparseArrayArr[0].valueAt(i21)).storyItem;
                                if (storyItem != null) {
                                    arrayList3.add(storyItem.media);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(aw0Var.getContext(), 0, u6Var);
                                if (arrayList3.size() > 1) {
                                    i11 = R.string.DeleteBotPreviewsTitle;
                                } else {
                                    i11 = R.string.DeleteBotPreviewTitle;
                                }
                                String string2 = LocaleController.getString(i11);
                                e2 e2Var2 = alertDialog$Builder2.f22366a;
                                e2Var2.R = string2;
                                e2Var2.T = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList3.size(), new Object[0]);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new qy(aw0Var, currentList, arrayList3, 3));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new qd0(20));
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
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(aw0Var.getContext(), 0, u6Var);
                            if (arrayList4.size() > 1) {
                                i10 = R.string.DeleteStoriesTitle;
                            } else {
                                i10 = R.string.DeleteStoryTitle;
                            }
                            String string3 = LocaleController.getString(i10);
                            e2 e2Var3 = alertDialog$Builder3.f22366a;
                            e2Var3.R = string3;
                            e2Var3.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList4.size(), new Object[0]);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i212) {
                                    switch (r3) {
                                        case 0:
                                            aw0 aw0Var2 = aw0Var;
                                            org.telegram.ui.ActionBar.r2 r2Var2 = aw0Var2.f26702x1;
                                            di.h7 storiesController = r2Var2.getMessagesController().getStoriesController();
                                            long j12 = aw0Var2.l1;
                                            ArrayList arrayList32 = arrayList4;
                                            storiesController.s(j12, arrayList32);
                                            wc.b0(r2Var2).R(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList32.size(), new Object[0])).j();
                                            aw0Var2.S(false);
                                            return;
                                        default:
                                            aw0 aw0Var3 = aw0Var;
                                            aw0Var3.getClass();
                                            int i222 = 0;
                                            while (true) {
                                                ArrayList arrayList42 = arrayList4;
                                                if (i222 < arrayList42.size()) {
                                                    aw0Var3.f26702x1.getMessagesController().deleteSavedDialog(((Long) arrayList42.get(i222)).longValue());
                                                    i222++;
                                                } else {
                                                    aw0Var3.S(true);
                                                    return;
                                                }
                                            }
                                    }
                                }
                            });
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new qd0(21));
                            e2Var3.show();
                            e2Var3.i();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (i16 == 100) {
                    if (aw0Var.f26656g1 != null && r2Var.getMessagesController().isUserNoForwards(aw0Var.f26656g1)) {
                        t40 t40Var = aw0Var.G1;
                        if (t40Var != null) {
                            t40Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                            aw0Var.G1.f(view, true);
                            return;
                        }
                        return;
                    }
                    if (aw0Var.f26653f1 != null) {
                        TLRPC.Chat chat3 = r2Var.getMessagesController().getChat(Long.valueOf(aw0Var.f26653f1.f22028id));
                        if (r2Var.getMessagesController().isChatNoForwards(chat3)) {
                            t40 t40Var2 = aw0Var.G1;
                            if (t40Var2 != null) {
                                if (ChatObject.isChannel(chat3) && !chat3.megagroup) {
                                    string = LocaleController.getString(R.string.ForwardsRestrictedInfoChannel);
                                } else {
                                    string = LocaleController.getString(R.string.ForwardsRestrictedInfoGroup);
                                }
                                t40Var2.setText(string);
                                aw0Var.G1.f(view, true);
                                return;
                            }
                            return;
                        }
                    }
                    if (aw0Var.r0()) {
                        t40 t40Var3 = aw0Var.G1;
                        if (t40Var3 != null) {
                            t40Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                            aw0Var.G1.f(view, true);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("canSelectTopics", true);
                    bundle.putInt("dialogsType", 3);
                    cy cyVar = new cy(bundle);
                    cyVar.C2 = new wr0(aw0Var);
                    r2Var.presentFragment(cyVar);
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
                        un unVar = new un(bundle2);
                        unVar.X7 = messageObject.getId();
                        long j12 = aw0Var.F;
                        if (j12 != 0) {
                            pg.d.a(unVar, MessagesStorage.TopicKey.of(dialogId, j12));
                            bundle2.putInt("message_id", messageObject.getId());
                        }
                        r2Var.presentFragment(unVar, false);
                        return;
                    }
                    return;
                } else if (i16 == 103 || i16 == 104) {
                    if (aw0Var.getClosestTab() == 8) {
                        hu0 hu0Var = aw0Var.f26648e0;
                        if (hu0Var != null && hu0Var.f34830s != null) {
                            ArrayList arrayList5 = new ArrayList();
                            for (int i23 = 0; i23 < sparseArrayArr[0].size(); i23++) {
                                arrayList5.add(Integer.valueOf(((MessageObject) sparseArrayArr[0].valueAt(i23)).getId()));
                            }
                            if (i16 != 103) {
                                z14 = false;
                            }
                            aw0Var.Z0(arrayList5, z14);
                            aw0Var.S(false);
                            return;
                        }
                        return;
                    }
                    SavedMessagesController savedMessagesController2 = r2Var.getMessagesController().getSavedMessagesController();
                    ArrayList<Long> arrayList6 = new ArrayList<>();
                    for (int i24 = 0; i24 < savedMessagesController2.allDialogs.size(); i24++) {
                        long j13 = savedMessagesController2.allDialogs.get(i24).dialogId;
                        if (lv0Var.f30296w.contains(Long.valueOf(j13))) {
                            arrayList6.add(Long.valueOf(j13));
                        }
                    }
                    if (i16 == 103) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!savedMessagesController2.updatePinned(arrayList6, z11, true)) {
                        r2Var.showDialog(new tg.j0(33, r2Var.getCurrentAccount(), aw0Var.getContext(), r2Var, null));
                    } else {
                        int i25 = 0;
                        while (true) {
                            tu0[] tu0VarArr = aw0Var.m0;
                            if (i25 < tu0VarArr.length) {
                                tu0 tu0Var = tu0VarArr[i25];
                                if (tu0Var.E == 11) {
                                    tu0Var.f33160w.h1(0, 0);
                                } else {
                                    i25++;
                                }
                            }
                        }
                    }
                    aw0Var.S(true);
                    return;
                } else {
                    return;
                }
            case 20:
                y71 y71Var = (y71) obj;
                int i26 = y71Var.f34967b.f26246i.f31505q;
                if (i26 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    y71Var.updateAppUpdateViews(i16, true);
                    return;
                } else if (i26 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    y71Var.updateAppUpdateViews(i16, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", y71Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 21:
                ((org.telegram.ui.Components.voip.v0) obj).f34138b.x(i16, true);
                return;
            case 22:
                ih1 ih1Var = (ih1) obj;
                if (ih1Var.U == null && view.getAlpha() != 0.0f) {
                    ih1Var.c(i16, true);
                    return;
                }
                return;
            case 23:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i16);
                return;
            case 24:
                b80 b80Var = (b80) obj;
                b80Var.Q.dismiss();
                int i27 = b80Var.f37995c0;
                if (i27 >= 0) {
                    b80Var.f37996d0.setKeepMedia(i27, i16);
                    y70 y70Var = b80Var.f37997e0;
                    if (y70Var != null) {
                        y70Var.a(i16);
                        return;
                    }
                    return;
                }
                y70 y70Var2 = b80Var.f37997e0;
                if (y70Var2 != null) {
                    y70Var2.a(i16);
                    return;
                }
                return;
            case 25:
                pg0 pg0Var = (pg0) obj;
                ValueAnimator valueAnimator = pg0Var.f44132c.S;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    tg1 tg1Var = pg0Var.f44132c;
                    if (!tg1Var.H) {
                        if (tg1Var.getCurrentPosition() == i16) {
                            r2 X = pg0Var.X();
                            if (X instanceof og0) {
                                ((og0) X).s();
                                return;
                            }
                            return;
                        }
                        pg0Var.j0(i16, true);
                        pg0Var.f44132c.E(i16);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ((wj0) obj).d.v.E(i16);
                return;
            case 27:
                in0 in0Var = (in0) obj;
                hm0 hm0Var = in0Var.D1;
                in0Var.S0 = i16;
                if (i16 == 1) {
                    in0Var.f40289i0 = in0Var.f40285g0;
                } else if (i16 == 4) {
                    in0Var.f40289i0 = in0Var.f40287h0;
                } else if (i16 == 2) {
                    in0Var.f40289i0 = in0Var.f40280e0;
                } else if (i16 == 3) {
                    in0Var.f40289i0 = in0Var.f40283f0;
                } else {
                    in0Var.f40289i0 = in0Var.f40278d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.u1().M2(null, in0Var, null);
                if (i16 == 1) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(in0Var.f40292j1);
                    PhotoViewer.u1().e2(arrayList7, 0, hm0Var);
                    return;
                } else if (i16 == 2) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(in0Var.l1);
                    PhotoViewer.u1().e2(arrayList8, 0, hm0Var);
                    return;
                } else if (i16 == 3) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(in0Var.f40296m1);
                    PhotoViewer.u1().e2(arrayList9, 0, hm0Var);
                    return;
                } else if (i16 == 0) {
                    PhotoViewer u12 = PhotoViewer.u1();
                    ArrayList arrayList10 = in0Var.f40290i1;
                    u12.e2(arrayList10, arrayList10.indexOf(secureDocument), hm0Var);
                    return;
                } else {
                    PhotoViewer u13 = PhotoViewer.u1();
                    ArrayList arrayList11 = in0Var.f40294k1;
                    u13.e2(arrayList11, arrayList11.indexOf(secureDocument), hm0Var);
                    return;
                }
            case 28:
                aq0 aq0Var = (aq0) obj;
                org.telegram.ui.ActionBar.o1 o1Var = aq0Var.I;
                if (o1Var != null && o1Var.isShowing()) {
                    aq0Var.I.d(true);
                }
                if (i16 == 0) {
                    g5.K(aq0Var.getParentActivity(), aq0Var.F.a(), new sp0(aq0Var, 2));
                    return;
                }
                aq0Var.W(aq0Var.f37873b, aq0Var.f37874c, true, 0);
                aq0Var.finishFragment();
                return;
            default:
                rq0 rq0Var = (rq0) obj;
                org.telegram.ui.ActionBar.o1 o1Var2 = rq0Var.m0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    rq0Var.m0.d(true);
                }
                if (i16 == 0) {
                    g5.K(rq0Var.getParentActivity(), rq0Var.U.a(), new eq0(rq0Var, 1));
                    return;
                } else {
                    rq0Var.f0(0, true);
                    return;
                }
        }
    }
}
