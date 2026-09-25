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
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.l30;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.y61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b01;
import org.telegram.ui.c01;
import org.telegram.ui.cq0;
import org.telegram.ui.fi1;
import org.telegram.ui.fm0;
import org.telegram.ui.gn0;
import org.telegram.ui.gq0;
import org.telegram.ui.i80;
import org.telegram.ui.jx0;
import org.telegram.ui.k80;
import org.telegram.ui.sa1;
import org.telegram.ui.sh1;
import org.telegram.ui.tq0;
import org.telegram.ui.up0;
import org.telegram.ui.wn;
import org.telegram.ui.xg0;
import org.telegram.ui.yg0;
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
                cb cbVar = (cb) obj;
                if (cbVar.e.contains(Integer.valueOf(i12))) {
                    if (cbVar.e.size() > 1) {
                        cbVar.e.remove(Integer.valueOf(i12));
                    } else {
                        return;
                    }
                } else {
                    cbVar.e.add(Integer.valueOf(i12));
                }
                AndroidUtilities.forEachViews((RecyclerView) cbVar.f5535b, (Utilities.Callback<View>) new ai.y1(cbVar, 10));
                return;
            case 1:
                u6 u6Var = ((s6) obj).f5495b;
                if (u6Var.f5613r && (callback = u6Var.f5611f) != null) {
                    callback.run(Integer.valueOf(i12));
                    return;
                }
                return;
            case 2:
                ((ii.e2) obj).P.Y3(i12);
                return;
            case 3:
                View.OnClickListener onClickListener = ((jh.e) obj).f13008b[i12];
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
                ((wn) obj).G9(i12);
                return;
            case 6:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            g0Var.f24322f0 = !g0Var.f24322f0;
                        }
                    } else {
                        g0Var.f24321e0 = !g0Var.f24321e0;
                    }
                } else {
                    g0Var.f24320d0 = !g0Var.f24320d0;
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
                boolean z13 = ChatAttachAlertPhotoLayout.f22121q1;
                chatAttachAlertPhotoLayout.f27088b.X0.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.f22165w.M(null, null);
                return;
            case 9:
                ((m30) obj).f26346b.x(i12, true);
                return;
            case 10:
                m30 m30Var = ((l30) obj).f26015c;
                m30Var.n(i12);
                m30Var.dismiss();
                return;
            case 11:
                od0 od0Var = (od0) obj;
                if (od0Var.e.getAdapter() instanceof md0) {
                    lz lzVar = ((fy) ((md0) od0Var.e.getAdapter())).f24284c;
                    if ((i12 == 1 || i12 == 2) && lzVar.f26300w1) {
                        if (i12 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        lzVar.P(true, false, z10);
                        return;
                    } else if (i12 == 0 && lzVar.f26296v1) {
                        lzVar.P(true, true, false);
                        return;
                    }
                }
                od0Var.e.x(i12, false);
                return;
            case 12:
                org.telegram.ui.Components.q4 q4Var = (org.telegram.ui.Components.q4) obj;
                EditTextBoldCursor editTextBoldCursor = q4Var.f24217c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                q4Var.d.run(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                q4Var.dismiss();
                return;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i12, scrollSlidingTextTabStrip.f22389a.indexOfChild(view));
                return;
            case 14:
                y61 y61Var = (y61) obj;
                int i13 = y61Var.f30520b.f22353i.f23571q;
                if (i13 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    y61Var.updateAppUpdateViews(i12, true);
                    return;
                } else if (i13 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    y61Var.updateAppUpdateViews(i12, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", y61Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 15:
                ((org.telegram.ui.Components.voip.x0) obj).f29739b.x(i12, true);
                return;
            case 16:
                fi1 fi1Var = (fi1) obj;
                if (fi1Var.U == null && view.getAlpha() != 0.0f) {
                    fi1Var.c(i12, true);
                    return;
                }
                return;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i12);
                return;
            case 18:
                k80 k80Var = (k80) obj;
                k80Var.Q.dismiss();
                int i14 = k80Var.f34974c0;
                if (i14 >= 0) {
                    k80Var.f34975d0.setKeepMedia(i14, i12);
                    i80 i80Var = k80Var.f34976e0;
                    if (i80Var != null) {
                        i80Var.a(i12);
                        return;
                    }
                    return;
                }
                i80 i80Var2 = k80Var.f34976e0;
                if (i80Var2 != null) {
                    i80Var2.a(i12);
                    return;
                }
                return;
            case 19:
                yg0 yg0Var = (yg0) obj;
                ValueAnimator valueAnimator = yg0Var.f38127c.Q;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    sh1 sh1Var = yg0Var.f38127c;
                    if (!sh1Var.H) {
                        if (sh1Var.getCurrentPosition() == i12) {
                            org.telegram.ui.ActionBar.m2 X = yg0Var.X();
                            if (X instanceof xg0) {
                                ((xg0) X).r();
                                return;
                            }
                            return;
                        }
                        yg0Var.m0(i12, true);
                        yg0Var.f38127c.D(i12);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                gn0 gn0Var = (gn0) obj;
                fm0 fm0Var = gn0Var.D1;
                gn0Var.S0 = i12;
                if (i12 == 1) {
                    gn0Var.f33990i0 = gn0Var.f33986g0;
                } else if (i12 == 4) {
                    gn0Var.f33990i0 = gn0Var.f33988h0;
                } else if (i12 == 2) {
                    gn0Var.f33990i0 = gn0Var.f33981e0;
                } else if (i12 == 3) {
                    gn0Var.f33990i0 = gn0Var.f33984f0;
                } else {
                    gn0Var.f33990i0 = gn0Var.f33979d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().J2(null, gn0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(gn0Var.f33993j1);
                    PhotoViewer.t1().b2(arrayList, 0, fm0Var);
                    return;
                } else if (i12 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(gn0Var.l1);
                    PhotoViewer.t1().b2(arrayList2, 0, fm0Var);
                    return;
                } else if (i12 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(gn0Var.f33997m1);
                    PhotoViewer.t1().b2(arrayList3, 0, fm0Var);
                    return;
                } else if (i12 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = gn0Var.f33991i1;
                    t12.b2(arrayList4, arrayList4.indexOf(secureDocument), fm0Var);
                    return;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = gn0Var.f33995k1;
                    t13.b2(arrayList5, arrayList5.indexOf(secureDocument), fm0Var);
                    return;
                }
            case 21:
                cq0 cq0Var = (cq0) obj;
                org.telegram.ui.ActionBar.m1 m1Var = cq0Var.I;
                if (m1Var != null && m1Var.isShowing()) {
                    cq0Var.I.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.e5.L(cq0Var.getParentActivity(), cq0Var.F.a(), new up0(cq0Var, 2));
                    return;
                }
                cq0Var.V(cq0Var.f32773b, cq0Var.f32774c, true, 0);
                cq0Var.finishFragment();
                return;
            case 22:
                tq0 tq0Var = (tq0) obj;
                org.telegram.ui.ActionBar.m1 m1Var2 = tq0Var.m0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    tq0Var.m0.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.e5.L(tq0Var.getParentActivity(), tq0Var.U.a(), new gq0(tq0Var, 1));
                    return;
                } else {
                    tq0Var.e0(0, true);
                    return;
                }
            case 23:
                MessageObject messageObject = (MessageObject) obj;
                int i15 = PopupNotificationActivity.f31430b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i12).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i12 == 0) {
                    c01 c01Var = profileActivity.O;
                    if (!c01Var.C1) {
                        if (jv0.w0(c01Var.getClosestTab())) {
                            c01 c01Var2 = profileActivity.O;
                            profileActivity.O.O0(profileActivity, profileActivity.a(), c01Var2.h1(c01Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            lc E = lc.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.f5100x = new b01(profileActivity);
                            E.R(null);
                            return;
                        }
                    }
                }
                if (jv0.w0(profileActivity.O.getClosestTab())) {
                    long a2 = profileActivity.a();
                    c01 c01Var3 = profileActivity.O;
                    int h12 = c01Var3.h1(c01Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.u8 u8Var = profileActivity.f31692x5;
                    if (u8Var != null) {
                        u8Var.run();
                        profileActivity.f31692x5 = null;
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
                org.telegram.messenger.u8 u8Var2 = profileActivity.f31692x5;
                if (u8Var2 != null) {
                    u8Var2.run();
                    profileActivity.f31692x5 = null;
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
                    profileActivity.f31692x5 = new org.telegram.messenger.u8(profileActivity, clientUserId, arrayList7, z11, 9);
                    org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 7);
                    if (z14) {
                        j3 = org.telegram.ui.Components.xc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), fVar).j();
                    } else {
                        j3 = org.telegram.ui.Components.xc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, fVar).j();
                    }
                    j3.v = new jx0(11, profileActivity, zArr3);
                    return;
                }
                return;
            case 25:
                sa1 sa1Var = (sa1) obj;
                sa1Var.f37680i0.D(i12);
                sa1Var.m0(i12, true);
                return;
            case 26:
                yh.r0 r0Var = ((yh.s0) obj).f47986j0;
                int i19 = yh.r0.f47938s;
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
