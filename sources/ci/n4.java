package ci;

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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.od0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ah0;
import org.telegram.ui.bh0;
import org.telegram.ui.by0;
import org.telegram.ui.d01;
import org.telegram.ui.di1;
import org.telegram.ui.e01;
import org.telegram.ui.fq0;
import org.telegram.ui.im0;
import org.telegram.ui.jn0;
import org.telegram.ui.jq0;
import org.telegram.ui.l80;
import org.telegram.ui.n80;
import org.telegram.ui.qh1;
import org.telegram.ui.ra1;
import org.telegram.ui.wq0;
import org.telegram.ui.xn;
import org.telegram.ui.xp0;
public final class n4 implements View.OnClickListener {
    public final int f5201a;
    public final int f5202b;
    public final Object f5203c;

    public n4(Object obj, int i10, int i11) {
        this.f5201a = i11;
        this.f5203c = obj;
        this.f5202b = i10;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        boolean z10;
        boolean z11;
        int i10;
        org.telegram.ui.Components.qc j3;
        int i11 = this.f5201a;
        int i12 = this.f5202b;
        Object obj = this.f5203c;
        switch (i11) {
            case 0:
                bb bbVar = (bb) obj;
                if (bbVar.e.contains(Integer.valueOf(i12))) {
                    if (bbVar.e.size() > 1) {
                        bbVar.e.remove(Integer.valueOf(i12));
                    } else {
                        return;
                    }
                } else {
                    bbVar.e.add(Integer.valueOf(i12));
                }
                AndroidUtilities.forEachViews((RecyclerView) bbVar.f5542b, (Utilities.Callback<View>) new ai.y1(bbVar, 10));
                return;
            case 1:
                u6 u6Var = ((s6) obj).f5499b;
                if (u6Var.f5639r && (callback = u6Var.f5637f) != null) {
                    callback.run(Integer.valueOf(i12));
                    return;
                }
                return;
            case 2:
                ((ii.e2) obj).P.Z3(i12);
                return;
            case 3:
                View.OnClickListener onClickListener = ((jh.e) obj).f13011b[i12];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 4:
                jh.a aVar = ((jh.h) obj).h;
                if (aVar != null) {
                    aVar.j(i12);
                    return;
                }
                return;
            case 5:
                ((xn) obj).G9(i12);
                return;
            case 6:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            g0Var.f24422f0 = !g0Var.f24422f0;
                        }
                    } else {
                        g0Var.f24421e0 = !g0Var.f24421e0;
                    }
                } else {
                    g0Var.f24420d0 = !g0Var.f24420d0;
                }
                g0Var.X.N(true);
                g0Var.s();
                return;
            case 7:
                boolean[] zArr = (boolean[]) obj;
                boolean z12 = !zArr[i12];
                zArr[i12] = z12;
                ((org.telegram.ui.Cells.a2) view).c(z12, true);
                return;
            case 8:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f22123q1;
                chatAttachAlertPhotoLayout.f27104b.X0.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.f22167w.M(null, null);
                return;
            case 9:
                ((o30) obj).f26951b.x(i12, true);
                return;
            case 10:
                o30 o30Var = ((n30) obj).f26724c;
                o30Var.n(i12);
                o30Var.dismiss();
                return;
            case 11:
                od0 od0Var = (od0) obj;
                if (od0Var.e.getAdapter() instanceof md0) {
                    mz mzVar = ((fy) ((md0) od0Var.e.getAdapter())).f24395c;
                    if ((i12 == 1 || i12 == 2) && mzVar.f26637w1) {
                        if (i12 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        mzVar.P(true, false, z10);
                        return;
                    } else if (i12 == 0 && mzVar.f26633v1) {
                        mzVar.P(true, true, false);
                        return;
                    }
                }
                od0Var.e.x(i12, false);
                return;
            case 12:
                org.telegram.ui.Components.q4 q4Var = (org.telegram.ui.Components.q4) obj;
                EditTextBoldCursor editTextBoldCursor = q4Var.f24867c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                q4Var.d.run(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                q4Var.dismiss();
                return;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i12, scrollSlidingTextTabStrip.f22391a.indexOfChild(view));
                return;
            case 14:
                b71 b71Var = (b71) obj;
                int i13 = b71Var.f22921b.f22355i.f24241q;
                if (i13 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    b71Var.updateAppUpdateViews(i12, true);
                    return;
                } else if (i13 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    b71Var.updateAppUpdateViews(i12, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", b71Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 15:
                ((org.telegram.ui.Components.voip.x0) obj).f29681b.x(i12, true);
                return;
            case 16:
                di1 di1Var = (di1) obj;
                if (di1Var.U == null && view.getAlpha() != 0.0f) {
                    di1Var.c(i12, true);
                    return;
                }
                return;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i12);
                return;
            case 18:
                n80 n80Var = (n80) obj;
                n80Var.Q.dismiss();
                int i14 = n80Var.f35842c0;
                if (i14 >= 0) {
                    n80Var.f35843d0.setKeepMedia(i14, i12);
                    l80 l80Var = n80Var.f35844e0;
                    if (l80Var != null) {
                        l80Var.a(i12);
                        return;
                    }
                    return;
                }
                l80 l80Var2 = n80Var.f35844e0;
                if (l80Var2 != null) {
                    l80Var2.a(i12);
                    return;
                }
                return;
            case 19:
                bh0 bh0Var = (bh0) obj;
                ValueAnimator valueAnimator = bh0Var.f37134c.R;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    qh1 qh1Var = bh0Var.f37134c;
                    if (!qh1Var.H) {
                        if (qh1Var.getCurrentPosition() == i12) {
                            org.telegram.ui.ActionBar.o2 X = bh0Var.X();
                            if (X instanceof ah0) {
                                ((ah0) X).r();
                                return;
                            }
                            return;
                        }
                        bh0Var.m0(i12, true);
                        bh0Var.f37134c.E(i12);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                jn0 jn0Var = (jn0) obj;
                im0 im0Var = jn0Var.D1;
                jn0Var.S0 = i12;
                if (i12 == 1) {
                    jn0Var.f34787i0 = jn0Var.f34783g0;
                } else if (i12 == 4) {
                    jn0Var.f34787i0 = jn0Var.f34785h0;
                } else if (i12 == 2) {
                    jn0Var.f34787i0 = jn0Var.f34778e0;
                } else if (i12 == 3) {
                    jn0Var.f34787i0 = jn0Var.f34781f0;
                } else {
                    jn0Var.f34787i0 = jn0Var.f34776d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().J2(null, jn0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(jn0Var.f34790j1);
                    PhotoViewer.t1().b2(arrayList, 0, im0Var);
                    return;
                } else if (i12 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(jn0Var.l1);
                    PhotoViewer.t1().b2(arrayList2, 0, im0Var);
                    return;
                } else if (i12 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(jn0Var.f34794m1);
                    PhotoViewer.t1().b2(arrayList3, 0, im0Var);
                    return;
                } else if (i12 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = jn0Var.f34788i1;
                    t12.b2(arrayList4, arrayList4.indexOf(secureDocument), im0Var);
                    return;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = jn0Var.f34792k1;
                    t13.b2(arrayList5, arrayList5.indexOf(secureDocument), im0Var);
                    return;
                }
            case 21:
                fq0 fq0Var = (fq0) obj;
                org.telegram.ui.ActionBar.o1 o1Var = fq0Var.I;
                if (o1Var != null && o1Var.isShowing()) {
                    fq0Var.I.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.e5.L(fq0Var.getParentActivity(), fq0Var.F.a(), new xp0(fq0Var, 2));
                    return;
                }
                fq0Var.V(fq0Var.f33608b, fq0Var.f33609c, true, 0);
                fq0Var.finishFragment();
                return;
            case 22:
                wq0 wq0Var = (wq0) obj;
                org.telegram.ui.ActionBar.o1 o1Var2 = wq0Var.m0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    wq0Var.m0.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.e5.L(wq0Var.getParentActivity(), wq0Var.U.a(), new jq0(wq0Var, 1));
                    return;
                } else {
                    wq0Var.e0(0, true);
                    return;
                }
            case 23:
                MessageObject messageObject = (MessageObject) obj;
                int i15 = PopupNotificationActivity.f31431b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i12).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i12 == 0) {
                    e01 e01Var = profileActivity.O;
                    if (!e01Var.C1) {
                        if (lv0.w0(e01Var.getClosestTab())) {
                            e01 e01Var2 = profileActivity.O;
                            profileActivity.O.O0(profileActivity, profileActivity.a(), e01Var2.h1(e01Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            kc E = kc.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.f5056x = new d01(profileActivity);
                            E.R(null);
                            return;
                        }
                    }
                }
                if (lv0.w0(profileActivity.O.getClosestTab())) {
                    long a2 = profileActivity.a();
                    e01 e01Var3 = profileActivity.O;
                    int h12 = e01Var3.h1(e01Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.u8 u8Var = profileActivity.f31693x5;
                    if (u8Var != null) {
                        u8Var.run();
                        profileActivity.f31693x5 = null;
                    }
                    org.telegram.ui.Components.qc.e();
                    ArrayList arrayList6 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i16 = 0; i16 < actionModeSelected.size(); i16++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i16).storyItem;
                            if (storyItem != null) {
                                arrayList6.add(storyItem);
                            }
                        }
                    }
                    profileActivity.O.L(false);
                    if (!arrayList6.isEmpty()) {
                        org.telegram.messenger.j7 j7Var = new org.telegram.messenger.j7(profileActivity, a2, h12, arrayList6, 14);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList6);
                        org.telegram.ui.Components.xc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList6.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), j7Var).j();
                        return;
                    }
                    return;
                }
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                org.telegram.messenger.u8 u8Var2 = profileActivity.f31693x5;
                if (u8Var2 != null) {
                    u8Var2.run();
                    profileActivity.f31693x5 = null;
                }
                org.telegram.ui.Components.qc.e();
                if (profileActivity.O.getClosestTab() == 9) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ArrayList arrayList7 = new ArrayList();
                SparseArray<MessageObject> actionModeSelected2 = profileActivity.O.getActionModeSelected();
                if (actionModeSelected2 != null) {
                    i10 = 0;
                    for (int i17 = 0; i17 < actionModeSelected2.size(); i17++) {
                        TL_stories.StoryItem storyItem2 = actionModeSelected2.valueAt(i17).storyItem;
                        if (storyItem2 != null) {
                            arrayList7.add(storyItem2);
                            i10++;
                        }
                    }
                } else {
                    i10 = 0;
                }
                profileActivity.O.L(false);
                if (z11) {
                    profileActivity.O.Y0(8);
                }
                if (!arrayList7.isEmpty()) {
                    boolean[] zArr2 = new boolean[arrayList7.size()];
                    for (int i18 = 0; i18 < arrayList7.size(); i18++) {
                        TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) arrayList7.get(i18);
                        zArr2[i18] = storyItem3.pinned;
                        storyItem3.pinned = z11;
                    }
                    profileActivity.getMessagesController().getStoriesController().n0(clientUserId, arrayList7, false);
                    boolean[] zArr3 = {false};
                    boolean z14 = z11;
                    profileActivity.f31693x5 = new org.telegram.messenger.u8(profileActivity, clientUserId, arrayList7, z11, 9);
                    org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 7);
                    if (z14) {
                        j3 = org.telegram.ui.Components.xc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), fVar).j();
                    } else {
                        j3 = org.telegram.ui.Components.xc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, fVar).j();
                    }
                    j3.v = new by0(7, profileActivity, zArr3);
                    return;
                }
                return;
            case 25:
                ra1 ra1Var = (ra1) obj;
                ra1Var.f37065h0.E(i12);
                ra1Var.k0(i12, true);
                return;
            case 26:
                yh.r0 r0Var = ((yh.s0) obj).f48030j0;
                int i19 = yh.r0.f47985s;
                r0Var.a(i12);
                return;
            default:
                ((yh.r0) obj).a(i12);
                return;
        }
    }

    public n4(MessageObject messageObject, int i10) {
        this.f5201a = 23;
        this.f5202b = i10;
        this.f5203c = messageObject;
    }
}
