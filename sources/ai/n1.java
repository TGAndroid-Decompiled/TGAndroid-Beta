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
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ah1;
import org.telegram.ui.jp0;
import org.telegram.ui.jq0;
import org.telegram.ui.jv0;
import org.telegram.ui.mg0;
import org.telegram.ui.mz0;
import org.telegram.ui.ng0;
import org.telegram.ui.ng1;
import org.telegram.ui.nz0;
import org.telegram.ui.p40;
import org.telegram.ui.p91;
import org.telegram.ui.qn;
import org.telegram.ui.sp0;
import org.telegram.ui.t70;
import org.telegram.ui.v70;
import org.telegram.ui.vl0;
import org.telegram.ui.vm0;
import org.telegram.ui.wp0;
public final class n1 implements View.OnClickListener {
    public final int f1864a;
    public final int f1865b;
    public final Object f1866c;

    public n1(Object obj, int i10, int i11) {
        this.f1864a = i11;
        this.f1866c = obj;
        this.f1865b = i10;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        boolean z10;
        boolean z11;
        int i10;
        org.telegram.ui.Components.qc j10;
        int i11 = this.f1864a;
        int i12 = 1;
        int i13 = this.f1865b;
        Object obj = this.f1866c;
        switch (i11) {
            case 0:
                z1 z1Var = ((a2) obj).f934j0;
                int i14 = z1.f2524s;
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
                AndroidUtilities.forEachViews((RecyclerView) maVar.f9365b, (Utilities.Callback<View>) new r0(maVar, 16));
                return;
            case 3:
                ei.k6 k6Var = ((ei.h6) obj).f9159b;
                if (k6Var.f9319r && (callback = k6Var.f9317f) != null) {
                    callback.run(Integer.valueOf(i13));
                    return;
                }
                return;
            case 4:
                View.OnClickListener onClickListener = ((kh.e) obj).f15070b[i13];
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
                ((ki.d2) obj).P.Z3(i13);
                return;
            case 7:
                ((qn) obj).L9(i13);
                return;
            case 8:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            g0Var.f26452f0 = !g0Var.f26452f0;
                        }
                    } else {
                        g0Var.f26451e0 = !g0Var.f26451e0;
                    }
                } else {
                    g0Var.f26450d0 = !g0Var.f26450d0;
                }
                g0Var.X.N(true);
                g0Var.u();
                return;
            case 9:
                boolean[] zArr = (boolean[]) obj;
                boolean z12 = !zArr[i13];
                zArr[i13] = z12;
                ((org.telegram.ui.Cells.a2) view).c(z12, true);
                return;
            case 10:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f24077q1;
                chatAttachAlertPhotoLayout.f28173b.f30530a1.getActionBarMenuOnItemClick().b(i13);
                chatAttachAlertPhotoLayout.f24121w.M(null, null);
                return;
            case 11:
                ((p40) obj).f30831b.x(i13, true);
                return;
            case 12:
                p40 p40Var = ((t30) obj).f30426c;
                p40Var.o(i13);
                p40Var.dismiss();
                return;
            case 13:
                xd0 xd0Var = (xd0) obj;
                if (xd0Var.e.getAdapter() instanceof vd0) {
                    tz tzVar = ((ly) ((vd0) xd0Var.e.getAdapter())).f28320c;
                    if ((i13 == 1 || i13 == 2) && tzVar.f30786w1) {
                        if (i13 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        tzVar.P(true, false, z10);
                        return;
                    } else if (i13 == 0 && tzVar.f30782v1) {
                        tzVar.P(true, true, false);
                        return;
                    }
                }
                xd0Var.e.x(i13, false);
                return;
            case 14:
                org.telegram.ui.Components.r4 r4Var = (org.telegram.ui.Components.r4) obj;
                EditTextBoldCursor editTextBoldCursor = r4Var.f30324c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                r4Var.d.run(Integer.valueOf(i13), editTextBoldCursor.getText().toString());
                r4Var.dismiss();
                return;
            case 15:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i13, scrollSlidingTextTabStrip.f24345a.indexOfChild(view));
                return;
            case 16:
                i71 i71Var = (i71) obj;
                int i15 = i71Var.f27149b.f24309i.f28764q;
                if (i15 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    i71Var.updateAppUpdateViews(i13, true);
                    return;
                } else if (i15 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    i71Var.updateAppUpdateViews(i13, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", i71Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 17:
                ((org.telegram.ui.Components.voip.v0) obj).f31781b.x(i13, true);
                return;
            case 18:
                ah1 ah1Var = (ah1) obj;
                if (ah1Var.U == null && view.getAlpha() != 0.0f) {
                    ah1Var.c(i13, true);
                    return;
                }
                return;
            case 19:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i13);
                return;
            case 20:
                v70 v70Var = (v70) obj;
                v70Var.Q.dismiss();
                int i16 = v70Var.f42132c0;
                if (i16 >= 0) {
                    v70Var.f42133d0.setKeepMedia(i16, i13);
                    t70 t70Var = v70Var.f42134e0;
                    if (t70Var != null) {
                        t70Var.a(i13);
                        return;
                    }
                    return;
                }
                t70 t70Var2 = v70Var.f42134e0;
                if (t70Var2 != null) {
                    t70Var2.a(i13);
                    return;
                }
                return;
            case 21:
                ng0 ng0Var = (ng0) obj;
                ValueAnimator valueAnimator = ng0Var.f39888c.Q;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    ng1 ng1Var = ng0Var.f39888c;
                    if (!ng1Var.H) {
                        if (ng1Var.getCurrentPosition() == i13) {
                            org.telegram.ui.ActionBar.n2 X = ng0Var.X();
                            if (X instanceof mg0) {
                                ((mg0) X).t();
                                return;
                            }
                            return;
                        }
                        ng0Var.m0(i13, true);
                        ng0Var.f39888c.D(i13);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                vm0 vm0Var = (vm0) obj;
                vl0 vl0Var = vm0Var.D1;
                vm0Var.S0 = i13;
                if (i13 == 1) {
                    vm0Var.f42301i0 = vm0Var.f42297g0;
                } else if (i13 == 4) {
                    vm0Var.f42301i0 = vm0Var.f42299h0;
                } else if (i13 == 2) {
                    vm0Var.f42301i0 = vm0Var.f42292e0;
                } else if (i13 == 3) {
                    vm0Var.f42301i0 = vm0Var.f42295f0;
                } else {
                    vm0Var.f42301i0 = vm0Var.f42290d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.u1().M2(null, vm0Var, null);
                if (i13 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(vm0Var.f42304j1);
                    PhotoViewer.u1().e2(arrayList, 0, vl0Var);
                    return;
                } else if (i13 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(vm0Var.l1);
                    PhotoViewer.u1().e2(arrayList2, 0, vl0Var);
                    return;
                } else if (i13 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(vm0Var.f42308m1);
                    PhotoViewer.u1().e2(arrayList3, 0, vl0Var);
                    return;
                } else if (i13 == 0) {
                    PhotoViewer u12 = PhotoViewer.u1();
                    ArrayList arrayList4 = vm0Var.f42302i1;
                    u12.e2(arrayList4, arrayList4.indexOf(secureDocument), vl0Var);
                    return;
                } else {
                    PhotoViewer u13 = PhotoViewer.u1();
                    ArrayList arrayList5 = vm0Var.f42306k1;
                    u13.e2(arrayList5, arrayList5.indexOf(secureDocument), vl0Var);
                    return;
                }
            case 23:
                sp0 sp0Var = (sp0) obj;
                org.telegram.ui.ActionBar.m1 m1Var = sp0Var.I;
                if (m1Var != null && m1Var.isShowing()) {
                    sp0Var.I.d(true);
                }
                if (i13 == 0) {
                    org.telegram.ui.Components.f5.K(sp0Var.getParentActivity(), sp0Var.F.a(), new jp0(sp0Var, 2));
                    return;
                }
                sp0Var.V(sp0Var.f41507b, sp0Var.f41508c, true, 0);
                sp0Var.finishFragment();
                return;
            case 24:
                jq0 jq0Var = (jq0) obj;
                org.telegram.ui.ActionBar.m1 m1Var2 = jq0Var.m0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    jq0Var.m0.d(true);
                }
                if (i13 == 0) {
                    org.telegram.ui.Components.f5.K(jq0Var.getParentActivity(), jq0Var.U.a(), new wp0(jq0Var, 1));
                    return;
                } else {
                    jq0Var.e0(0, true);
                    return;
                }
            case 25:
                MessageObject messageObject = (MessageObject) obj;
                int i17 = PopupNotificationActivity.f33486b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i13).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i13 == 0) {
                    nz0 nz0Var = profileActivity.O;
                    if (!nz0Var.C1) {
                        if (uv0.y0(nz0Var.getClosestTab())) {
                            nz0 nz0Var2 = profileActivity.O;
                            profileActivity.O.Q0(profileActivity, profileActivity.a(), nz0Var2.j1(nz0Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            ei.vb D = ei.vb.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.f10021x = new mz0(profileActivity);
                            D.Q(null);
                            return;
                        }
                    }
                }
                if (uv0.y0(profileActivity.O.getClosestTab())) {
                    long a2 = profileActivity.a();
                    nz0 nz0Var3 = profileActivity.O;
                    int j12 = nz0Var3.j1(nz0Var3.getClosestTab());
                    String w9 = profileActivity.getMessagesController().getStoriesController().w(j12, a2);
                    org.telegram.messenger.q8 q8Var = profileActivity.f33764z5;
                    if (q8Var != null) {
                        q8Var.run();
                        profileActivity.f33764z5 = null;
                    }
                    org.telegram.ui.Components.qc.e();
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
                    profileActivity.O.L(false);
                    if (!arrayList6.isEmpty()) {
                        xb xbVar = new xb(profileActivity, a2, j12, arrayList6, 15);
                        profileActivity.getMessagesController().getStoriesController().c0(j12, a2, arrayList6);
                        org.telegram.ui.Components.xc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList6.size(), w9)), LocaleController.getString(R.string.UndoNoCaps), xbVar).j();
                        return;
                    }
                    return;
                }
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                org.telegram.messenger.q8 q8Var2 = profileActivity.f33764z5;
                if (q8Var2 != null) {
                    q8Var2.run();
                    profileActivity.f33764z5 = null;
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
                profileActivity.O.L(false);
                if (z11) {
                    profileActivity.O.a1(8);
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
                    profileActivity.f33764z5 = new org.telegram.messenger.q8(profileActivity, clientUserId, arrayList7, z14, 9);
                    z zVar = new z(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 15);
                    if (z14) {
                        j10 = org.telegram.ui.Components.xc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), zVar).j();
                    } else {
                        j10 = org.telegram.ui.Components.xc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, zVar).j();
                    }
                    j10.v = new jv0(14, profileActivity, zArr3);
                    return;
                }
                return;
            case 27:
                p91 p91Var = (p91) obj;
                p91Var.f40139i0.D(i13);
                p91Var.m0(i13, true);
                return;
            case 28:
                org.telegram.ui.Wallet.ha haVar = (org.telegram.ui.Wallet.ha) obj;
                EditText editText = haVar.f34303a;
                TextView[] textViewArr = haVar.N;
                TextView textView = textViewArr[i13];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i13].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    haVar.a();
                    haVar.a();
                    Runnable runnable = haVar.f34308r;
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
                ArrayList arrayList8 = k0Var.f52087n;
                if (i13 >= 0 && i13 < arrayList8.size()) {
                    k0Var.v = true;
                    k0Var.h.a(i13, true);
                    int i21 = ((zh.o) arrayList8.get(i13)).d;
                    int L0 = sVar.L0();
                    if ((sVar.m(i21) == null && Math.abs(i21 - L0) > k0Var.f52088r * 9) || !SharedConfig.animationsEnabled()) {
                        k0Var.f52085c.B0();
                        ml0 ml0Var = k0Var.f52086f;
                        if (L0 < i21) {
                            i12 = 0;
                        }
                        ml0Var.f28544b = i12;
                        ml0Var.c(i21, 0, false, false);
                        return;
                    }
                    s4.c0 c0Var = new s4.c0(k0Var.getContext());
                    c0Var.f46058a = ((zh.o) arrayList8.get(i13)).d;
                    sVar.w0(c0Var);
                    return;
                }
                return;
        }
    }

    public n1(MessageObject messageObject, int i10) {
        this.f1864a = 25;
        this.f1865b = i10;
        this.f1866c = messageObject;
    }
}
