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
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ch1;
import org.telegram.ui.lp0;
import org.telegram.ui.lq0;
import org.telegram.ui.lv0;
import org.telegram.ui.ng0;
import org.telegram.ui.og0;
import org.telegram.ui.oz0;
import org.telegram.ui.pg1;
import org.telegram.ui.pz0;
import org.telegram.ui.r40;
import org.telegram.ui.r91;
import org.telegram.ui.sn;
import org.telegram.ui.up0;
import org.telegram.ui.v70;
import org.telegram.ui.x70;
import org.telegram.ui.xl0;
import org.telegram.ui.xm0;
import org.telegram.ui.yp0;
public final class n1 implements View.OnClickListener {
    public final int f1877a;
    public final int f1878b;
    public final Object f1879c;

    public n1(Object obj, int i10, int i11) {
        this.f1877a = i11;
        this.f1879c = obj;
        this.f1878b = i10;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        boolean z10;
        boolean z11;
        int i10;
        org.telegram.ui.Components.qc j10;
        int i11 = this.f1877a;
        int i12 = 1;
        int i13 = this.f1878b;
        Object obj = this.f1879c;
        switch (i11) {
            case 0:
                z1 z1Var = ((a2) obj).f936j0;
                int i14 = z1.f2519s;
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
                AndroidUtilities.forEachViews((RecyclerView) maVar.f9366b, (Utilities.Callback<View>) new r0(maVar, 16));
                return;
            case 3:
                ei.k6 k6Var = ((ei.h6) obj).f9160b;
                if (k6Var.f9320r && (callback = k6Var.f9318f) != null) {
                    callback.run(Integer.valueOf(i13));
                    return;
                }
                return;
            case 4:
                View.OnClickListener onClickListener = ((kh.e) obj).f15069b[i13];
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
                ((sn) obj).L9(i13);
                return;
            case 8:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            g0Var.f26423f0 = !g0Var.f26423f0;
                        }
                    } else {
                        g0Var.f26422e0 = !g0Var.f26422e0;
                    }
                } else {
                    g0Var.f26421d0 = !g0Var.f26421d0;
                }
                g0Var.X.N(true);
                g0Var.t();
                return;
            case 9:
                boolean[] zArr = (boolean[]) obj;
                boolean z12 = !zArr[i13];
                zArr[i13] = z12;
                ((org.telegram.ui.Cells.a2) view).c(z12, true);
                return;
            case 10:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f24073q1;
                chatAttachAlertPhotoLayout.f28238b.f30558a1.getActionBarMenuOnItemClick().b(i13);
                chatAttachAlertPhotoLayout.f24117w.M(null, null);
                return;
            case 11:
                ((r40) obj).f30870b.x(i13, true);
                return;
            case 12:
                r40 r40Var = ((t30) obj).f30456c;
                r40Var.o(i13);
                r40Var.dismiss();
                return;
            case 13:
                xd0 xd0Var = (xd0) obj;
                if (xd0Var.e.getAdapter() instanceof vd0) {
                    tz tzVar = ((ly) ((vd0) xd0Var.e.getAdapter())).f28343c;
                    if ((i13 == 1 || i13 == 2) && tzVar.f30810w1) {
                        if (i13 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        tzVar.P(true, false, z10);
                        return;
                    } else if (i13 == 0 && tzVar.f30806v1) {
                        tzVar.P(true, true, false);
                        return;
                    }
                }
                xd0Var.e.x(i13, false);
                return;
            case 14:
                org.telegram.ui.Components.r4 r4Var = (org.telegram.ui.Components.r4) obj;
                EditTextBoldCursor editTextBoldCursor = r4Var.f29998c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                r4Var.d.run(Integer.valueOf(i13), editTextBoldCursor.getText().toString());
                r4Var.dismiss();
                return;
            case 15:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i13, scrollSlidingTextTabStrip.f24341a.indexOfChild(view));
                return;
            case 16:
                g71 g71Var = (g71) obj;
                int i15 = g71Var.f26494b.f24305i.f28719q;
                if (i15 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    g71Var.updateAppUpdateViews(i13, true);
                    return;
                } else if (i15 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    g71Var.updateAppUpdateViews(i13, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", g71Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 17:
                ((org.telegram.ui.Components.voip.v0) obj).f31820b.x(i13, true);
                return;
            case 18:
                ch1 ch1Var = (ch1) obj;
                if (ch1Var.U == null && view.getAlpha() != 0.0f) {
                    ch1Var.c(i13, true);
                    return;
                }
                return;
            case 19:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i13);
                return;
            case 20:
                x70 x70Var = (x70) obj;
                x70Var.Q.dismiss();
                int i16 = x70Var.f43000c0;
                if (i16 >= 0) {
                    x70Var.f43001d0.setKeepMedia(i16, i13);
                    v70 v70Var = x70Var.f43002e0;
                    if (v70Var != null) {
                        v70Var.a(i13);
                        return;
                    }
                    return;
                }
                v70 v70Var2 = x70Var.f43002e0;
                if (v70Var2 != null) {
                    v70Var2.a(i13);
                    return;
                }
                return;
            case 21:
                og0 og0Var = (og0) obj;
                ValueAnimator valueAnimator = og0Var.f40396c.Q;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    pg1 pg1Var = og0Var.f40396c;
                    if (!pg1Var.H) {
                        if (pg1Var.getCurrentPosition() == i13) {
                            org.telegram.ui.ActionBar.n2 X = og0Var.X();
                            if (X instanceof ng0) {
                                ((ng0) X).s();
                                return;
                            }
                            return;
                        }
                        og0Var.m0(i13, true);
                        og0Var.f40396c.D(i13);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                xm0 xm0Var = (xm0) obj;
                xl0 xl0Var = xm0Var.D1;
                xm0Var.S0 = i13;
                if (i13 == 1) {
                    xm0Var.f43165i0 = xm0Var.f43161g0;
                } else if (i13 == 4) {
                    xm0Var.f43165i0 = xm0Var.f43163h0;
                } else if (i13 == 2) {
                    xm0Var.f43165i0 = xm0Var.f43156e0;
                } else if (i13 == 3) {
                    xm0Var.f43165i0 = xm0Var.f43159f0;
                } else {
                    xm0Var.f43165i0 = xm0Var.f43154d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, xm0Var, null);
                if (i13 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(xm0Var.f43168j1);
                    PhotoViewer.t1().c2(arrayList, 0, xl0Var);
                    return;
                } else if (i13 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(xm0Var.l1);
                    PhotoViewer.t1().c2(arrayList2, 0, xl0Var);
                    return;
                } else if (i13 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(xm0Var.f43172m1);
                    PhotoViewer.t1().c2(arrayList3, 0, xl0Var);
                    return;
                } else if (i13 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = xm0Var.f43166i1;
                    t12.c2(arrayList4, arrayList4.indexOf(secureDocument), xl0Var);
                    return;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = xm0Var.f43170k1;
                    t13.c2(arrayList5, arrayList5.indexOf(secureDocument), xl0Var);
                    return;
                }
            case 23:
                up0 up0Var = (up0) obj;
                org.telegram.ui.ActionBar.m1 m1Var = up0Var.I;
                if (m1Var != null && m1Var.isShowing()) {
                    up0Var.I.d(true);
                }
                if (i13 == 0) {
                    org.telegram.ui.Components.f5.K(up0Var.getParentActivity(), up0Var.F.a(), new lp0(up0Var, 2));
                    return;
                }
                up0Var.V(up0Var.f42000b, up0Var.f42001c, true, 0);
                up0Var.finishFragment();
                return;
            case 24:
                lq0 lq0Var = (lq0) obj;
                org.telegram.ui.ActionBar.m1 m1Var2 = lq0Var.m0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    lq0Var.m0.d(true);
                }
                if (i13 == 0) {
                    org.telegram.ui.Components.f5.K(lq0Var.getParentActivity(), lq0Var.U.a(), new yp0(lq0Var, 1));
                    return;
                } else {
                    lq0Var.e0(0, true);
                    return;
                }
            case 25:
                MessageObject messageObject = (MessageObject) obj;
                int i17 = PopupNotificationActivity.f33473b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i13).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i13 == 0) {
                    pz0 pz0Var = profileActivity.O;
                    if (!pz0Var.C1) {
                        if (sv0.y0(pz0Var.getClosestTab())) {
                            pz0 pz0Var2 = profileActivity.O;
                            profileActivity.O.Q0(profileActivity, profileActivity.a(), pz0Var2.j1(pz0Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            ei.vb D = ei.vb.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.f10022x = new oz0(profileActivity);
                            D.Q(null);
                            return;
                        }
                    }
                }
                if (sv0.y0(profileActivity.O.getClosestTab())) {
                    long a2 = profileActivity.a();
                    pz0 pz0Var3 = profileActivity.O;
                    int j12 = pz0Var3.j1(pz0Var3.getClosestTab());
                    String w9 = profileActivity.getMessagesController().getStoriesController().w(j12, a2);
                    org.telegram.messenger.p8 p8Var = profileActivity.f33750z5;
                    if (p8Var != null) {
                        p8Var.run();
                        profileActivity.f33750z5 = null;
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
                org.telegram.messenger.p8 p8Var2 = profileActivity.f33750z5;
                if (p8Var2 != null) {
                    p8Var2.run();
                    profileActivity.f33750z5 = null;
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
                    profileActivity.f33750z5 = new org.telegram.messenger.p8(profileActivity, clientUserId, arrayList7, z14, 9);
                    z zVar = new z(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 14);
                    if (z14) {
                        j10 = org.telegram.ui.Components.xc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), zVar).j();
                    } else {
                        j10 = org.telegram.ui.Components.xc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, zVar).j();
                    }
                    j10.v = new lv0(14, profileActivity, zArr3);
                    return;
                }
                return;
            case 27:
                r91 r91Var = (r91) obj;
                r91Var.f40640i0.D(i13);
                r91Var.m0(i13, true);
                return;
            case 28:
                org.telegram.ui.Wallet.ga gaVar = (org.telegram.ui.Wallet.ga) obj;
                EditText editText = gaVar.f34241a;
                TextView[] textViewArr = gaVar.N;
                TextView textView = textViewArr[i13];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i13].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    gaVar.a();
                    gaVar.a();
                    Runnable runnable = gaVar.f34246r;
                    if (runnable != null) {
                        editText.post(runnable);
                        return;
                    }
                    return;
                }
                return;
            default:
                zh.d0 d0Var = ((zh.q) obj).h;
                s4.s sVar = d0Var.d;
                ArrayList arrayList8 = d0Var.f51799n;
                if (i13 >= 0 && i13 < arrayList8.size()) {
                    d0Var.v = true;
                    d0Var.h.a(i13, true);
                    int i21 = ((zh.o) arrayList8.get(i13)).d;
                    int L0 = sVar.L0();
                    if ((sVar.m(i21) == null && Math.abs(i21 - L0) > d0Var.f51800r * 9) || !SharedConfig.animationsEnabled()) {
                        d0Var.f51797c.B0();
                        ll0 ll0Var = d0Var.f51798f;
                        if (L0 < i21) {
                            i12 = 0;
                        }
                        ll0Var.f28257b = i12;
                        ll0Var.c(i21, 0, false, false);
                        return;
                    }
                    s4.c0 c0Var = new s4.c0(d0Var.getContext());
                    c0Var.f46051a = ((zh.o) arrayList8.get(i13)).d;
                    sVar.w0(c0Var);
                    return;
                }
                return;
        }
    }

    public n1(MessageObject messageObject, int i10) {
        this.f1877a = 25;
        this.f1878b = i10;
        this.f1879c = messageObject;
    }
}
