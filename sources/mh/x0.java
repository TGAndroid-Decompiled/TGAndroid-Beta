package mh;

import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.aq0;
import org.telegram.ui.bi1;
import org.telegram.ui.em0;
import org.telegram.ui.f80;
import org.telegram.ui.fn0;
import org.telegram.ui.h80;
import org.telegram.ui.mq0;
import org.telegram.ui.na1;
import org.telegram.ui.oh1;
import org.telegram.ui.op0;
import org.telegram.ui.pr0;
import org.telegram.ui.vg0;
import org.telegram.ui.wg0;
import org.telegram.ui.wp0;
import org.telegram.ui.xn;
import org.telegram.ui.yz0;
import org.telegram.ui.zz0;
public final class x0 implements View.OnClickListener {
    public final int f15027a;
    public final int f15028b;
    public final Object f15029c;

    public x0(Object obj, int i10, int i11) {
        this.f15027a = i11;
        this.f15029c = obj;
        this.f15028b = i10;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        boolean z10;
        int i10;
        ic j10;
        Utilities.Callback callback;
        int i11 = this.f15027a;
        int i12 = this.f15028b;
        Object obj = this.f15029c;
        switch (i11) {
            case 0:
                h1 h1Var = ((i1) obj).f14208g0;
                int i13 = h1.f14153s;
                h1Var.a(i12);
                return;
            case 1:
                ((h1) obj).a(i12);
                return;
            case 2:
                ((xn) obj).G9(i12);
                return;
            case 3:
                org.telegram.ui.Components.h0 h0Var = (org.telegram.ui.Components.h0) obj;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            h0Var.f27322c0 = !h0Var.f27322c0;
                        }
                    } else {
                        h0Var.f27321b0 = !h0Var.f27321b0;
                    }
                } else {
                    h0Var.f27320a0 = !h0Var.f27320a0;
                }
                h0Var.U.N(true);
                h0Var.s();
                return;
            case 4:
                boolean[] zArr = (boolean[]) obj;
                boolean z11 = !zArr[i12];
                zArr[i12] = z11;
                ((org.telegram.ui.Cells.z1) view).c(z11, true);
                return;
            case 5:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f24738n1;
                chatAttachAlertPhotoLayout.f26590b.U0.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.f24779w.M(null, null);
                return;
            case 6:
                ((o30) obj).f29650b.x(i12, true);
                return;
            case 7:
                o30 o30Var = ((n30) obj).f29374c;
                o30Var.n(i12);
                o30Var.dismiss();
                return;
            case 8:
                hd0 hd0Var = (hd0) obj;
                if (hd0Var.f27481e.getAdapter() instanceof fd0) {
                    mz mzVar = ((ey) ((fd0) hd0Var.f27481e.getAdapter())).f26693c;
                    if ((i12 == 1 || i12 == 2) && mzVar.f29328t1) {
                        if (i12 == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        mzVar.R(true, false, z4);
                        return;
                    } else if (i12 == 0 && mzVar.f29325s1) {
                        mzVar.R(true, true, false);
                        return;
                    }
                }
                hd0Var.f27481e.x(i12, false);
                return;
            case 9:
                org.telegram.ui.Components.l4 l4Var = (org.telegram.ui.Components.l4) obj;
                EditTextBoldCursor editTextBoldCursor = l4Var.f26009c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                l4Var.d.run(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                l4Var.dismiss();
                return;
            case 10:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i12, scrollSlidingTextTabStrip.f25012a.indexOfChild(view));
                return;
            case 11:
                o61 o61Var = (o61) obj;
                int i14 = o61Var.f29675b.f24974i.f32706q;
                if (i14 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    o61Var.updateAppUpdateViews(i12, true);
                    return;
                } else if (i14 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    o61Var.updateAppUpdateViews(i12, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", o61Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 12:
                ((org.telegram.ui.Components.voip.v0) obj).f32414b.x(i12, true);
                return;
            case 13:
                bi1 bi1Var = (bi1) obj;
                if (bi1Var.R == null && view.getAlpha() != 0.0f) {
                    bi1Var.c(i12, true);
                    return;
                }
                return;
            case 14:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i12);
                return;
            case 15:
                h80 h80Var = (h80) obj;
                h80Var.N.dismiss();
                int i15 = h80Var.W;
                if (i15 >= 0) {
                    h80Var.f37261a0.setKeepMedia(i15, i12);
                    f80 f80Var = h80Var.f37262b0;
                    if (f80Var != null) {
                        f80Var.a(i12);
                        return;
                    }
                    return;
                }
                f80 f80Var2 = h80Var.f37262b0;
                if (f80Var2 != null) {
                    f80Var2.a(i12);
                    return;
                }
                return;
            case 16:
                wg0 wg0Var = (wg0) obj;
                ValueAnimator valueAnimator = wg0Var.f40022c.N;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    oh1 oh1Var = wg0Var.f40022c;
                    if (!oh1Var.E) {
                        if (oh1Var.getCurrentPosition() == i12) {
                            org.telegram.ui.ActionBar.p2 X = wg0Var.X();
                            if (X instanceof vg0) {
                                ((vg0) X).s();
                                return;
                            }
                            return;
                        }
                        wg0Var.m0(i12, true);
                        wg0Var.f40022c.D(i12);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                fn0 fn0Var = (fn0) obj;
                em0 em0Var = fn0Var.A1;
                fn0Var.P0 = i12;
                if (i12 == 1) {
                    fn0Var.f36835f0 = fn0Var.f36829d0;
                } else if (i12 == 4) {
                    fn0Var.f36835f0 = fn0Var.f36832e0;
                } else if (i12 == 2) {
                    fn0Var.f36835f0 = fn0Var.f36824b0;
                } else if (i12 == 3) {
                    fn0Var.f36835f0 = fn0Var.f36827c0;
                } else {
                    fn0Var.f36835f0 = fn0Var.f36821a0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, fn0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(fn0Var.f36838g1);
                    PhotoViewer.t1().b2(arrayList, 0, em0Var);
                    return;
                } else if (i12 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(fn0Var.f36842i1);
                    PhotoViewer.t1().b2(arrayList2, 0, em0Var);
                    return;
                } else if (i12 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(fn0Var.f36844j1);
                    PhotoViewer.t1().b2(arrayList3, 0, em0Var);
                    return;
                } else if (i12 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = fn0Var.f36836f1;
                    t12.b2(arrayList4, arrayList4.indexOf(secureDocument), em0Var);
                    return;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = fn0Var.f36840h1;
                    t13.b2(arrayList5, arrayList5.indexOf(secureDocument), em0Var);
                    return;
                }
            case 18:
                wp0 wp0Var = (wp0) obj;
                org.telegram.ui.ActionBar.p1 p1Var = wp0Var.F;
                if (p1Var != null && p1Var.isShowing()) {
                    wp0Var.F.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.z4.L(wp0Var.getParentActivity(), wp0Var.C.a(), new op0(wp0Var, 2));
                    return;
                }
                wp0Var.V(wp0Var.f42833b, wp0Var.f42834c, true, 0);
                wp0Var.finishFragment();
                return;
            case 19:
                mq0 mq0Var = (mq0) obj;
                org.telegram.ui.ActionBar.p1 p1Var2 = mq0Var.f39045j0;
                if (p1Var2 != null && p1Var2.isShowing()) {
                    mq0Var.f39045j0.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.z4.L(mq0Var.getParentActivity(), mq0Var.R.a(), new aq0(mq0Var, 1));
                    return;
                } else {
                    mq0Var.e0(0, true);
                    return;
                }
            case 20:
                MessageObject messageObject = (MessageObject) obj;
                int i16 = PopupNotificationActivity.Y;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i12).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 21:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i12 == 0) {
                    zz0 zz0Var = profileActivity.L;
                    if (!zz0Var.f33666z1) {
                        if (yu0.w0(zz0Var.getClosestTab())) {
                            zz0 zz0Var2 = profileActivity.L;
                            profileActivity.L.O0(profileActivity, profileActivity.a(), zz0Var2.h1(zz0Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            qh.ba E = qh.ba.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.f45115x = new yz0(profileActivity);
                            E.R(null);
                            return;
                        }
                    }
                }
                if (yu0.w0(profileActivity.L.getClosestTab())) {
                    long a2 = profileActivity.a();
                    zz0 zz0Var3 = profileActivity.L;
                    int h12 = zz0Var3.h1(zz0Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.w8 w8Var = profileActivity.f34706u5;
                    if (w8Var != null) {
                        w8Var.run();
                        profileActivity.f34706u5 = null;
                    }
                    ic.e();
                    ArrayList arrayList6 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.L.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i17 = 0; i17 < actionModeSelected.size(); i17++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i17).storyItem;
                            if (storyItem != null) {
                                arrayList6.add(storyItem);
                            }
                        }
                    }
                    profileActivity.L.L(false);
                    if (!arrayList6.isEmpty()) {
                        y8 y8Var = new y8(profileActivity, a2, h12, arrayList6, 14);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList6);
                        qc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList6.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), y8Var).j();
                        return;
                    }
                    return;
                }
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                org.telegram.messenger.w8 w8Var2 = profileActivity.f34706u5;
                if (w8Var2 != null) {
                    w8Var2.run();
                    profileActivity.f34706u5 = null;
                }
                ic.e();
                if (profileActivity.L.getClosestTab() == 9) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList7 = new ArrayList();
                SparseArray<MessageObject> actionModeSelected2 = profileActivity.L.getActionModeSelected();
                if (actionModeSelected2 != null) {
                    i10 = 0;
                    for (int i18 = 0; i18 < actionModeSelected2.size(); i18++) {
                        TL_stories.StoryItem storyItem2 = actionModeSelected2.valueAt(i18).storyItem;
                        if (storyItem2 != null) {
                            arrayList7.add(storyItem2);
                            i10++;
                        }
                    }
                } else {
                    i10 = 0;
                }
                profileActivity.L.L(false);
                if (z10) {
                    profileActivity.L.Y0(8);
                }
                if (!arrayList7.isEmpty()) {
                    boolean[] zArr2 = new boolean[arrayList7.size()];
                    for (int i19 = 0; i19 < arrayList7.size(); i19++) {
                        TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) arrayList7.get(i19);
                        zArr2[i19] = storyItem3.pinned;
                        storyItem3.pinned = z10;
                    }
                    profileActivity.getMessagesController().getStoriesController().n0(clientUserId, arrayList7, false);
                    boolean[] zArr3 = {false};
                    boolean z13 = z10;
                    profileActivity.f34706u5 = new org.telegram.messenger.w8(profileActivity, clientUserId, arrayList7, z13, 9);
                    lh.g1 g1Var = new lh.g1(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 15);
                    if (z13) {
                        j10 = qc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), g1Var).j();
                    } else {
                        j10 = qc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, g1Var).j();
                    }
                    j10.v = new pr0(22, profileActivity, zArr3);
                    return;
                }
                return;
            case 22:
                na1 na1Var = (na1) obj;
                na1Var.f39258f0.D(i12);
                na1Var.m0(i12, true);
                return;
            case 23:
                qh.t8 t8Var = (qh.t8) obj;
                if (t8Var.f45916e.contains(Integer.valueOf(i12))) {
                    if (t8Var.f45916e.size() > 1) {
                        t8Var.f45916e.remove(Integer.valueOf(i12));
                    } else {
                        return;
                    }
                } else {
                    t8Var.f45916e.add(Integer.valueOf(i12));
                }
                AndroidUtilities.forEachViews((RecyclerView) t8Var.f45914b, (h5.d) new ng.i(t8Var, 4));
                return;
            case 24:
                qh.d5 d5Var = ((qh.b5) obj).f45023b;
                if (d5Var.f45232r && (callback = d5Var.f45230f) != null) {
                    callback.run(Integer.valueOf(i12));
                    return;
                }
                return;
            case 25:
                ((wh.z1) obj).M.X3(i12);
                return;
            case 26:
                View.OnClickListener onClickListener = ((xg.e) obj).f50603b[i12];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                xg.a aVar = ((xg.g) obj).h;
                if (aVar != null) {
                    aVar.k(i12);
                    return;
                }
                return;
        }
    }

    public x0(MessageObject messageObject, int i10) {
        this.f15027a = 20;
        this.f15028b = i10;
        this.f15029c = messageObject;
    }
}
