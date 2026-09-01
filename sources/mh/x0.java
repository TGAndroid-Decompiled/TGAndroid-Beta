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
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.br0;
import org.telegram.ui.em0;
import org.telegram.ui.f80;
import org.telegram.ui.fn0;
import org.telegram.ui.h80;
import org.telegram.ui.ha1;
import org.telegram.ui.hq0;
import org.telegram.ui.ih1;
import org.telegram.ui.jp0;
import org.telegram.ui.rp0;
import org.telegram.ui.tz0;
import org.telegram.ui.uz0;
import org.telegram.ui.vg0;
import org.telegram.ui.vh1;
import org.telegram.ui.vp0;
import org.telegram.ui.wg0;
import org.telegram.ui.xn;
public final class x0 implements View.OnClickListener {
    public final int f15025a;
    public final int f15026b;
    public final Object f15027c;

    public x0(Object obj, int i10, int i11) {
        this.f15025a = i11;
        this.f15027c = obj;
        this.f15026b = i10;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        boolean z10;
        int i10;
        ic j10;
        Utilities.Callback callback;
        int i11 = this.f15025a;
        int i12 = this.f15026b;
        Object obj = this.f15027c;
        switch (i11) {
            case 0:
                h1 h1Var = ((i1) obj).f14206g0;
                int i13 = h1.f14151s;
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
                            h0Var.f27340c0 = !h0Var.f27340c0;
                        }
                    } else {
                        h0Var.f27339b0 = !h0Var.f27339b0;
                    }
                } else {
                    h0Var.f27338a0 = !h0Var.f27338a0;
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
                boolean z12 = ChatAttachAlertPhotoLayout.f24736n1;
                chatAttachAlertPhotoLayout.f26546b.U0.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.f24777w.M(null, null);
                return;
            case 6:
                ((o30) obj).f29660b.x(i12, true);
                return;
            case 7:
                o30 o30Var = ((n30) obj).f29386c;
                o30Var.n(i12);
                o30Var.dismiss();
                return;
            case 8:
                hd0 hd0Var = (hd0) obj;
                if (hd0Var.f27464e.getAdapter() instanceof fd0) {
                    mz mzVar = ((ey) ((fd0) hd0Var.f27464e.getAdapter())).f26661c;
                    if ((i12 == 1 || i12 == 2) && mzVar.f29326t1) {
                        if (i12 == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        mzVar.R(true, false, z4);
                        return;
                    } else if (i12 == 0 && mzVar.f29323s1) {
                        mzVar.R(true, true, false);
                        return;
                    }
                }
                hd0Var.f27464e.x(i12, false);
                return;
            case 9:
                org.telegram.ui.Components.l4 l4Var = (org.telegram.ui.Components.l4) obj;
                EditTextBoldCursor editTextBoldCursor = l4Var.f26297c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                l4Var.d.run(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                l4Var.dismiss();
                return;
            case 10:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i12, scrollSlidingTextTabStrip.f25010a.indexOfChild(view));
                return;
            case 11:
                p61 p61Var = (p61) obj;
                int i14 = p61Var.f29977b.f24972i.f32701q;
                if (i14 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    p61Var.updateAppUpdateViews(i12, true);
                    return;
                } else if (i14 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    p61Var.updateAppUpdateViews(i12, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", p61Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 12:
                ((org.telegram.ui.Components.voip.v0) obj).f32409b.x(i12, true);
                return;
            case 13:
                vh1 vh1Var = (vh1) obj;
                if (vh1Var.R == null && view.getAlpha() != 0.0f) {
                    vh1Var.c(i12, true);
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
                    h80Var.f37363a0.setKeepMedia(i15, i12);
                    f80 f80Var = h80Var.f37364b0;
                    if (f80Var != null) {
                        f80Var.a(i12);
                        return;
                    }
                    return;
                }
                f80 f80Var2 = h80Var.f37364b0;
                if (f80Var2 != null) {
                    f80Var2.a(i12);
                    return;
                }
                return;
            case 16:
                wg0 wg0Var = (wg0) obj;
                ValueAnimator valueAnimator = wg0Var.f38158c.N;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    ih1 ih1Var = wg0Var.f38158c;
                    if (!ih1Var.E) {
                        if (ih1Var.getCurrentPosition() == i12) {
                            org.telegram.ui.ActionBar.p2 X = wg0Var.X();
                            if (X instanceof vg0) {
                                ((vg0) X).s();
                                return;
                            }
                            return;
                        }
                        wg0Var.m0(i12, true);
                        wg0Var.f38158c.D(i12);
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
                    fn0Var.f36932f0 = fn0Var.f36926d0;
                } else if (i12 == 4) {
                    fn0Var.f36932f0 = fn0Var.f36929e0;
                } else if (i12 == 2) {
                    fn0Var.f36932f0 = fn0Var.f36921b0;
                } else if (i12 == 3) {
                    fn0Var.f36932f0 = fn0Var.f36924c0;
                } else {
                    fn0Var.f36932f0 = fn0Var.f36918a0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, fn0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(fn0Var.f36935g1);
                    PhotoViewer.t1().b2(arrayList, 0, em0Var);
                    return;
                } else if (i12 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(fn0Var.f36939i1);
                    PhotoViewer.t1().b2(arrayList2, 0, em0Var);
                    return;
                } else if (i12 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(fn0Var.f36941j1);
                    PhotoViewer.t1().b2(arrayList3, 0, em0Var);
                    return;
                } else if (i12 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = fn0Var.f36933f1;
                    t12.b2(arrayList4, arrayList4.indexOf(secureDocument), em0Var);
                    return;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = fn0Var.f36937h1;
                    t13.b2(arrayList5, arrayList5.indexOf(secureDocument), em0Var);
                    return;
                }
            case 18:
                rp0 rp0Var = (rp0) obj;
                org.telegram.ui.ActionBar.p1 p1Var = rp0Var.F;
                if (p1Var != null && p1Var.isShowing()) {
                    rp0Var.F.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.z4.L(rp0Var.getParentActivity(), rp0Var.C.a(), new jp0(rp0Var, 2));
                    return;
                }
                rp0Var.V(rp0Var.f41025b, rp0Var.f41026c, true, 0);
                rp0Var.finishFragment();
                return;
            case 19:
                hq0 hq0Var = (hq0) obj;
                org.telegram.ui.ActionBar.p1 p1Var2 = hq0Var.f37585j0;
                if (p1Var2 != null && p1Var2.isShowing()) {
                    hq0Var.f37585j0.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.z4.L(hq0Var.getParentActivity(), hq0Var.R.a(), new vp0(hq0Var, 1));
                    return;
                } else {
                    hq0Var.e0(0, true);
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
                    uz0 uz0Var = profileActivity.L;
                    if (!uz0Var.f34021z1) {
                        if (zu0.w0(uz0Var.getClosestTab())) {
                            uz0 uz0Var2 = profileActivity.L;
                            profileActivity.L.O0(profileActivity, profileActivity.a(), uz0Var2.h1(uz0Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            qh.ca E = qh.ca.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.f45149x = new tz0(profileActivity);
                            E.R(null);
                            return;
                        }
                    }
                }
                if (zu0.w0(profileActivity.L.getClosestTab())) {
                    long a2 = profileActivity.a();
                    uz0 uz0Var3 = profileActivity.L;
                    int h12 = uz0Var3.h1(uz0Var3.getClosestTab());
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
                    j10.v = new br0(23, profileActivity, zArr3);
                    return;
                }
                return;
            case 22:
                ha1 ha1Var = (ha1) obj;
                ha1Var.f37426f0.D(i12);
                ha1Var.m0(i12, true);
                return;
            case 23:
                qh.u8 u8Var = (qh.u8) obj;
                if (u8Var.f45937e.contains(Integer.valueOf(i12))) {
                    if (u8Var.f45937e.size() > 1) {
                        u8Var.f45937e.remove(Integer.valueOf(i12));
                    } else {
                        return;
                    }
                } else {
                    u8Var.f45937e.add(Integer.valueOf(i12));
                }
                AndroidUtilities.forEachViews((RecyclerView) u8Var.f45935b, (h5.d) new ng.i(u8Var, 4));
                return;
            case 24:
                qh.e5 e5Var = ((qh.c5) obj).f45057b;
                if (e5Var.f45251r && (callback = e5Var.f45249f) != null) {
                    callback.run(Integer.valueOf(i12));
                    return;
                }
                return;
            case 25:
                ((wh.z1) obj).M.Y3(i12);
                return;
            case 26:
                View.OnClickListener onClickListener = ((xg.e) obj).f50567b[i12];
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
        this.f15025a = 20;
        this.f15026b = i10;
        this.f15027c = messageObject;
    }
}
