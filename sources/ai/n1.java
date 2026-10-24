package ai;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
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
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.r30;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.Components.yd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c80;
import org.telegram.ui.gh1;
import org.telegram.ui.lp0;
import org.telegram.ui.lq0;
import org.telegram.ui.lv0;
import org.telegram.ui.pg0;
import org.telegram.ui.pz0;
import org.telegram.ui.qg0;
import org.telegram.ui.qz0;
import org.telegram.ui.s40;
import org.telegram.ui.sg1;
import org.telegram.ui.sn;
import org.telegram.ui.t91;
import org.telegram.ui.up0;
import org.telegram.ui.yl0;
import org.telegram.ui.yp0;
import org.telegram.ui.z70;
import org.telegram.ui.zm0;
public final class n1 implements View.OnClickListener {
    public final int f1854a;
    public final int f1855b;
    public final Object f1856c;

    public n1(Object obj, int i10, int i11) {
        this.f1854a = i11;
        this.f1856c = obj;
        this.f1855b = i10;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        boolean z10;
        boolean z11;
        int i10;
        org.telegram.ui.Components.oc j10;
        int i11 = this.f1854a;
        int i12 = 1;
        int i13 = this.f1855b;
        Object obj = this.f1856c;
        switch (i11) {
            case 0:
                z1 z1Var = ((a2) obj).f935j0;
                int i14 = z1.v;
                z1Var.a(i13);
                return;
            case 1:
                ((z1) obj).a(i13);
                return;
            case 2:
                ei.ma maVar = (ei.ma) obj;
                if (maVar.e.contains(Integer.valueOf(i13))) {
                    if (maVar.e.size() > 1) {
                        maVar.e.remove(Integer.valueOf(i13));
                    } else {
                        return;
                    }
                } else {
                    maVar.e.add(Integer.valueOf(i13));
                }
                AndroidUtilities.forEachViews((RecyclerView) maVar.f9376b, (Utilities.Callback<View>) new r0(maVar, 16));
                return;
            case 3:
                ei.k6 k6Var = ((ei.h6) obj).f9170b;
                if (k6Var.f9330r && (callback = k6Var.f9328f) != null) {
                    callback.run(Integer.valueOf(i13));
                    return;
                }
                return;
            case 4:
                View.OnClickListener onClickListener = ((kh.e) obj).f15116b[i13];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 5:
                kh.a aVar = ((kh.h) obj).h;
                if (aVar != null) {
                    aVar.j(i13);
                    return;
                }
                return;
            case 6:
                ((ki.d2) obj).P.e4(i13);
                return;
            case 7:
                ((sn) obj).L9(i13);
                return;
            case 8:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            g0Var.f26455f0 = !g0Var.f26455f0;
                        }
                    } else {
                        g0Var.f26454e0 = !g0Var.f26454e0;
                    }
                } else {
                    g0Var.f26453d0 = !g0Var.f26453d0;
                }
                g0Var.X.N(true);
                g0Var.t();
                return;
            case 9:
                boolean[] zArr = (boolean[]) obj;
                boolean z12 = !zArr[i13];
                zArr[i13] = z12;
                ((org.telegram.ui.Cells.z1) view).c(z12, true);
                return;
            case 10:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f24223q1;
                chatAttachAlertPhotoLayout.f27704b.f30130a1.getActionBarMenuOnItemClick().b(i13);
                chatAttachAlertPhotoLayout.f24267w.M(null, null);
                return;
            case 11:
                ((s40) obj).f30429b.x(i13, true);
                return;
            case 12:
                s40 s40Var = ((r30) obj).f30055c;
                s40Var.n(i13);
                s40Var.dismiss();
                return;
            case 13:
                yd0 yd0Var = (yd0) obj;
                if (yd0Var.e.getAdapter() instanceof wd0) {
                    rz rzVar = ((jy) ((wd0) yd0Var.e.getAdapter())).f27810c;
                    if ((i13 == 1 || i13 == 2) && rzVar.f30373w1) {
                        if (i13 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        rzVar.P(true, false, z10);
                        return;
                    } else if (i13 == 0 && rzVar.f30369v1) {
                        rzVar.P(true, true, false);
                        return;
                    }
                }
                yd0Var.e.x(i13, false);
                return;
            case 14:
                org.telegram.ui.Components.p4 p4Var = (org.telegram.ui.Components.p4) obj;
                EditTextBoldCursor editTextBoldCursor = p4Var.f31165c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                p4Var.d.run(Integer.valueOf(i13), editTextBoldCursor.getText().toString());
                p4Var.dismiss();
                return;
            case 15:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i13, scrollSlidingTextTabStrip.f24492a.indexOfChild(view));
                return;
            case 16:
                o71 o71Var = (o71) obj;
                int i15 = o71Var.f29165b.f24456i.f28563q;
                if (i15 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    o71Var.updateAppUpdateViews(i13, true);
                    return;
                } else if (i15 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    o71Var.updateAppUpdateViews(i13, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", o71Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 17:
                ((org.telegram.ui.Components.voip.v0) obj).f31936b.x(i13, true);
                return;
            case 18:
                gh1 gh1Var = (gh1) obj;
                if (gh1Var.U == null && view.getAlpha() != 0.0f) {
                    gh1Var.c(i13, true);
                    return;
                }
                return;
            case 19:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i13);
                return;
            case 20:
                c80 c80Var = (c80) obj;
                c80Var.Q.dismiss();
                int i16 = c80Var.f36262c0;
                if (i16 >= 0) {
                    c80Var.f36263d0.setKeepMedia(i16, i13);
                    z70 z70Var = c80Var.f36264e0;
                    if (z70Var != null) {
                        z70Var.a(i13);
                        return;
                    }
                    return;
                }
                z70 z70Var2 = c80Var.f36264e0;
                if (z70Var2 != null) {
                    z70Var2.a(i13);
                    return;
                }
                return;
            case 21:
                qg0 qg0Var = (qg0) obj;
                ValueAnimator valueAnimator = qg0Var.f42051c.Q;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    sg1 sg1Var = qg0Var.f42051c;
                    if (!sg1Var.H) {
                        if (sg1Var.getCurrentPosition() == i13) {
                            org.telegram.ui.ActionBar.o2 X = qg0Var.X();
                            if (X instanceof pg0) {
                                ((pg0) X).t();
                                return;
                            }
                            return;
                        }
                        qg0Var.m0(i13, true);
                        qg0Var.f42051c.D(i13);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                zm0 zm0Var = (zm0) obj;
                yl0 yl0Var = zm0Var.D1;
                zm0Var.S0 = i13;
                if (i13 == 1) {
                    zm0Var.f44144i0 = zm0Var.f44140g0;
                } else if (i13 == 4) {
                    zm0Var.f44144i0 = zm0Var.f44142h0;
                } else if (i13 == 2) {
                    zm0Var.f44144i0 = zm0Var.f44135e0;
                } else if (i13 == 3) {
                    zm0Var.f44144i0 = zm0Var.f44138f0;
                } else {
                    zm0Var.f44144i0 = zm0Var.f44133d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.u1().M2(null, zm0Var, null);
                if (i13 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(zm0Var.f44147j1);
                    PhotoViewer.u1().e2(arrayList, 0, yl0Var);
                    return;
                } else if (i13 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(zm0Var.l1);
                    PhotoViewer.u1().e2(arrayList2, 0, yl0Var);
                    return;
                } else if (i13 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(zm0Var.f44151m1);
                    PhotoViewer.u1().e2(arrayList3, 0, yl0Var);
                    return;
                } else if (i13 == 0) {
                    PhotoViewer u12 = PhotoViewer.u1();
                    ArrayList arrayList4 = zm0Var.f44145i1;
                    u12.e2(arrayList4, arrayList4.indexOf(secureDocument), yl0Var);
                    return;
                } else {
                    PhotoViewer u13 = PhotoViewer.u1();
                    ArrayList arrayList5 = zm0Var.f44149k1;
                    u13.e2(arrayList5, arrayList5.indexOf(secureDocument), yl0Var);
                    return;
                }
            case 23:
                up0 up0Var = (up0) obj;
                org.telegram.ui.ActionBar.m1 m1Var = up0Var.I;
                if (m1Var != null && m1Var.isShowing()) {
                    up0Var.I.d(true);
                }
                if (i13 == 0) {
                    org.telegram.ui.Components.d5.K(up0Var.getParentActivity(), up0Var.F.a(), new lp0(up0Var, 2));
                    return;
                }
                up0Var.V(up0Var.f42464b, up0Var.f42465c, true, 0);
                up0Var.finishFragment();
                return;
            case 24:
                lq0 lq0Var = (lq0) obj;
                org.telegram.ui.ActionBar.m1 m1Var2 = lq0Var.m0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    lq0Var.m0.d(true);
                }
                if (i13 == 0) {
                    org.telegram.ui.Components.d5.K(lq0Var.getParentActivity(), lq0Var.U.a(), new yp0(lq0Var, 1));
                    return;
                } else {
                    lq0Var.e0(0, true);
                    return;
                }
            case 25:
                MessageObject messageObject = (MessageObject) obj;
                int i17 = PopupNotificationActivity.f33789b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i13).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i13 == 0) {
                    qz0 qz0Var = profileActivity.O;
                    if (!qz0Var.C1) {
                        if (wv0.z0(qz0Var.getClosestTab())) {
                            qz0 qz0Var2 = profileActivity.O;
                            profileActivity.O.R0(profileActivity, profileActivity.a(), qz0Var2.k1(qz0Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            ei.vb D = ei.vb.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.f10038x = new pz0(profileActivity);
                            D.Q(null);
                            return;
                        }
                    }
                }
                if (wv0.z0(profileActivity.O.getClosestTab())) {
                    long a2 = profileActivity.a();
                    qz0 qz0Var3 = profileActivity.O;
                    int k12 = qz0Var3.k1(qz0Var3.getClosestTab());
                    String w9 = profileActivity.getMessagesController().getStoriesController().w(k12, a2);
                    org.telegram.messenger.t8 t8Var = profileActivity.f34067z5;
                    if (t8Var != null) {
                        t8Var.run();
                        profileActivity.f34067z5 = null;
                    }
                    org.telegram.ui.Components.oc.e();
                    ArrayList arrayList6 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i18 = 0; i18 < actionModeSelected.size(); i18++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i18).storyItem;
                            if (storyItem != null) {
                                arrayList6.add(storyItem);
                            }
                        }
                    }
                    profileActivity.O.M(false);
                    if (!arrayList6.isEmpty()) {
                        yb ybVar = new yb(profileActivity, a2, k12, arrayList6, 15);
                        profileActivity.getMessagesController().getStoriesController().c0(k12, a2, arrayList6);
                        org.telegram.ui.Components.vc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList6.size(), w9)), LocaleController.getString(R.string.UndoNoCaps), ybVar).j();
                        return;
                    }
                    return;
                }
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                org.telegram.messenger.t8 t8Var2 = profileActivity.f34067z5;
                if (t8Var2 != null) {
                    t8Var2.run();
                    profileActivity.f34067z5 = null;
                }
                org.telegram.ui.Components.oc.e();
                if (profileActivity.O.getClosestTab() == 9) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ArrayList arrayList7 = new ArrayList();
                SparseArray<MessageObject> actionModeSelected2 = profileActivity.O.getActionModeSelected();
                if (actionModeSelected2 != null) {
                    i10 = 0;
                    for (int i19 = 0; i19 < actionModeSelected2.size(); i19++) {
                        TL_stories.StoryItem storyItem2 = actionModeSelected2.valueAt(i19).storyItem;
                        if (storyItem2 != null) {
                            arrayList7.add(storyItem2);
                            i10++;
                        }
                    }
                } else {
                    i10 = 0;
                }
                profileActivity.O.M(false);
                if (z11) {
                    profileActivity.O.b1(8);
                }
                if (!arrayList7.isEmpty()) {
                    boolean[] zArr2 = new boolean[arrayList7.size()];
                    for (int i20 = 0; i20 < arrayList7.size(); i20++) {
                        TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) arrayList7.get(i20);
                        zArr2[i20] = storyItem3.pinned;
                        storyItem3.pinned = z11;
                    }
                    profileActivity.getMessagesController().getStoriesController().n0(clientUserId, arrayList7, false);
                    boolean[] zArr3 = {false};
                    boolean z14 = z11;
                    profileActivity.f34067z5 = new org.telegram.messenger.t8(profileActivity, clientUserId, arrayList7, z14, 9);
                    z zVar = new z(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 15);
                    if (z14) {
                        j10 = org.telegram.ui.Components.vc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), zVar).j();
                    } else {
                        j10 = org.telegram.ui.Components.vc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, zVar).j();
                    }
                    j10.v = new lv0(14, profileActivity, zArr3);
                    return;
                }
                return;
            case 27:
                t91 t91Var = (t91) obj;
                t91Var.f41953i0.D(i13);
                t91Var.m0(i13, true);
                return;
            case 28:
                org.telegram.ui.Wallet.ia iaVar = (org.telegram.ui.Wallet.ia) obj;
                EditText editText = iaVar.f34621a;
                TextView[] textViewArr = iaVar.N;
                TextView textView = textViewArr[i13];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i13].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    iaVar.a();
                    iaVar.a();
                    Runnable runnable = iaVar.f34626r;
                    if (runnable != null) {
                        editText.post(runnable);
                        return;
                    }
                    return;
                }
                return;
            default:
                zh.k0 k0Var = ((zh.q) obj).h;
                s4.s sVar = k0Var.d;
                ArrayList arrayList8 = k0Var.f52552n;
                if (i13 >= 0 && i13 < arrayList8.size()) {
                    k0Var.v = true;
                    k0Var.h.a(i13, true);
                    int i21 = ((zh.o) arrayList8.get(i13)).d;
                    int L0 = sVar.L0();
                    if ((sVar.m(i21) == null && Math.abs(i21 - L0) > k0Var.f52553r * 9) || !SharedConfig.animationsEnabled()) {
                        k0Var.f52550c.B0();
                        ol0 ol0Var = k0Var.f52551f;
                        if (L0 < i21) {
                            i12 = 0;
                        }
                        ol0Var.f29317b = i12;
                        ol0Var.c(i21, 0, false, false);
                        return;
                    }
                    s4.c0 c0Var = new s4.c0(k0Var.getContext());
                    c0Var.f46483a = ((zh.o) arrayList8.get(i13)).d;
                    sVar.w0(c0Var);
                    return;
                }
                return;
        }
    }

    public n1(MessageObject messageObject, int i10) {
        this.f1854a = 25;
        this.f1855b = i10;
        this.f1856c = messageObject;
    }
}
