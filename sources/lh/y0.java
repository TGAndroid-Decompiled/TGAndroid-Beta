package lh;

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
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.aq0;
import org.telegram.ui.bi1;
import org.telegram.ui.em0;
import org.telegram.ui.fn0;
import org.telegram.ui.g80;
import org.telegram.ui.gr0;
import org.telegram.ui.i80;
import org.telegram.ui.mq0;
import org.telegram.ui.oa1;
import org.telegram.ui.oh1;
import org.telegram.ui.op0;
import org.telegram.ui.wg0;
import org.telegram.ui.wp0;
import org.telegram.ui.xg0;
import org.telegram.ui.yz0;
import org.telegram.ui.zn;
import org.telegram.ui.zz0;
public final class y0 implements View.OnClickListener {
    public final int f13357a;
    public final int f13358b;
    public final Object f13359c;

    public y0(Object obj, int i10, int i11) {
        this.f13357a = i11;
        this.f13359c = obj;
        this.f13358b = i10;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        boolean z10;
        int i10;
        ic j10;
        Utilities.Callback callback;
        int i11 = this.f13357a;
        int i12 = this.f13358b;
        Object obj = this.f13359c;
        switch (i11) {
            case 0:
                i1 i1Var = ((j1) obj).f12626g0;
                int i13 = i1.f12559s;
                i1Var.a(i12);
                return;
            case 1:
                ((i1) obj).a(i12);
                return;
            case 2:
                ((zn) obj).G9(i12);
                return;
            case 3:
                org.telegram.ui.Components.h0 h0Var = (org.telegram.ui.Components.h0) obj;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            h0Var.f25278c0 = !h0Var.f25278c0;
                        }
                    } else {
                        h0Var.f25277b0 = !h0Var.f25277b0;
                    }
                } else {
                    h0Var.f25276a0 = !h0Var.f25276a0;
                }
                h0Var.U.N(true);
                h0Var.s();
                return;
            case 4:
                boolean[] zArr = (boolean[]) obj;
                boolean z11 = !zArr[i12];
                zArr[i12] = z11;
                ((org.telegram.ui.Cells.y1) view).c(z11, true);
                return;
            case 5:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f22867n1;
                chatAttachAlertPhotoLayout.f24282b.U0.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.f22908w.M(null, null);
                return;
            case 6:
                ((n30) obj).f27179b.x(i12, true);
                return;
            case 7:
                n30 n30Var = ((m30) obj).f26949c;
                n30Var.n(i12);
                n30Var.dismiss();
                return;
            case 8:
                gd0 gd0Var = (gd0) obj;
                if (gd0Var.e.getAdapter() instanceof ed0) {
                    kz kzVar = ((cy) ((ed0) gd0Var.e.getAdapter())).f24060c;
                    if ((i12 == 1 || i12 == 2) && kzVar.f26483t1) {
                        if (i12 == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        kzVar.R(true, false, z4);
                        return;
                    } else if (i12 == 0 && kzVar.f26480s1) {
                        kzVar.R(true, true, false);
                        return;
                    }
                }
                gd0Var.e.x(i12, false);
                return;
            case 9:
                org.telegram.ui.Components.l4 l4Var = (org.telegram.ui.Components.l4) obj;
                EditTextBoldCursor editTextBoldCursor = l4Var.f23721c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                l4Var.d.run(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                l4Var.dismiss();
                return;
            case 10:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i12, scrollSlidingTextTabStrip.f23126a.indexOfChild(view));
                return;
            case 11:
                n61 n61Var = (n61) obj;
                int i14 = n61Var.f27202b.f23090i.f29432q;
                if (i14 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    n61Var.updateAppUpdateViews(i12, true);
                    return;
                } else if (i14 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    n61Var.updateAppUpdateViews(i12, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", n61Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 12:
                ((org.telegram.ui.Components.voip.u0) obj).f29938b.x(i12, true);
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
                i80 i80Var = (i80) obj;
                i80Var.N.dismiss();
                int i15 = i80Var.W;
                if (i15 >= 0) {
                    i80Var.f34837a0.setKeepMedia(i15, i12);
                    g80 g80Var = i80Var.f34838b0;
                    if (g80Var != null) {
                        g80Var.a(i12);
                        return;
                    }
                    return;
                }
                g80 g80Var2 = i80Var.f34838b0;
                if (g80Var2 != null) {
                    g80Var2.a(i12);
                    return;
                }
                return;
            case 16:
                xg0 xg0Var = (xg0) obj;
                ValueAnimator valueAnimator = xg0Var.f37165c.N;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    oh1 oh1Var = xg0Var.f37165c;
                    if (!oh1Var.E) {
                        if (oh1Var.getCurrentPosition() == i12) {
                            org.telegram.ui.ActionBar.p2 X = xg0Var.X();
                            if (X instanceof wg0) {
                                ((wg0) X).s();
                                return;
                            }
                            return;
                        }
                        xg0Var.m0(i12, true);
                        xg0Var.f37165c.D(i12);
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
                    fn0Var.f34124f0 = fn0Var.f34119d0;
                } else if (i12 == 4) {
                    fn0Var.f34124f0 = fn0Var.f34121e0;
                } else if (i12 == 2) {
                    fn0Var.f34124f0 = fn0Var.f34114b0;
                } else if (i12 == 3) {
                    fn0Var.f34124f0 = fn0Var.f34117c0;
                } else {
                    fn0Var.f34124f0 = fn0Var.f34111a0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, fn0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(fn0Var.f34127g1);
                    PhotoViewer.t1().b2(arrayList, 0, em0Var);
                    return;
                } else if (i12 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(fn0Var.f34131i1);
                    PhotoViewer.t1().b2(arrayList2, 0, em0Var);
                    return;
                } else if (i12 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(fn0Var.f34133j1);
                    PhotoViewer.t1().b2(arrayList3, 0, em0Var);
                    return;
                } else if (i12 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = fn0Var.f34125f1;
                    t12.b2(arrayList4, arrayList4.indexOf(secureDocument), em0Var);
                    return;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = fn0Var.f34129h1;
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
                wp0Var.V(wp0Var.f39748b, wp0Var.f39749c, true, 0);
                wp0Var.finishFragment();
                return;
            case 19:
                mq0 mq0Var = (mq0) obj;
                org.telegram.ui.ActionBar.p1 p1Var2 = mq0Var.f36174j0;
                if (p1Var2 != null && p1Var2.isShowing()) {
                    mq0Var.f36174j0.d(true);
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
                    if (!zz0Var.f31172z1) {
                        if (yu0.w0(zz0Var.getClosestTab())) {
                            zz0 zz0Var2 = profileActivity.L;
                            profileActivity.L.O0(profileActivity, profileActivity.a(), zz0Var2.h1(zz0Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            ph.da E = ph.da.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.f41584x = new yz0(profileActivity);
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
                    org.telegram.messenger.w8 w8Var = profileActivity.f32147u5;
                    if (w8Var != null) {
                        w8Var.run();
                        profileActivity.f32147u5 = null;
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
                org.telegram.messenger.w8 w8Var2 = profileActivity.f32147u5;
                if (w8Var2 != null) {
                    w8Var2.run();
                    profileActivity.f32147u5 = null;
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
                    profileActivity.f32147u5 = new org.telegram.messenger.w8(profileActivity, clientUserId, arrayList7, z13, 9);
                    kh.g1 g1Var = new kh.g1(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 15);
                    if (z13) {
                        j10 = qc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), g1Var).j();
                    } else {
                        j10 = qc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, g1Var).j();
                    }
                    j10.v = new gr0(23, profileActivity, zArr3);
                    return;
                }
                return;
            case 22:
                oa1 oa1Var = (oa1) obj;
                oa1Var.f36720f0.D(i12);
                oa1Var.m0(i12, true);
                return;
            case 23:
                ph.v8 v8Var = (ph.v8) obj;
                if (v8Var.e.contains(Integer.valueOf(i12))) {
                    if (v8Var.e.size() > 1) {
                        v8Var.e.remove(Integer.valueOf(i12));
                    } else {
                        return;
                    }
                } else {
                    v8Var.e.add(Integer.valueOf(i12));
                }
                AndroidUtilities.forEachViews((RecyclerView) v8Var.f42276b, (h5.d) new mg.i(v8Var, 4));
                return;
            case 24:
                ph.f5 f5Var = ((ph.d5) obj).f41493b;
                if (f5Var.f41693r && (callback = f5Var.f41691f) != null) {
                    callback.run(Integer.valueOf(i12));
                    return;
                }
                return;
            case 25:
                ((vh.y1) obj).M.X3(i12);
                return;
            case 26:
                View.OnClickListener onClickListener = ((wg.e) obj).f46624b[i12];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                wg.a aVar = ((wg.g) obj).h;
                if (aVar != null) {
                    aVar.j(i12);
                    return;
                }
                return;
        }
    }

    public y0(MessageObject messageObject, int i10) {
        this.f13357a = 20;
        this.f13358b = i10;
        this.f13359c = messageObject;
    }
}
