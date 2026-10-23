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
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.yd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an0;
import org.telegram.ui.c80;
import org.telegram.ui.hh1;
import org.telegram.ui.mp0;
import org.telegram.ui.mq0;
import org.telegram.ui.mv0;
import org.telegram.ui.qg0;
import org.telegram.ui.qz0;
import org.telegram.ui.rg0;
import org.telegram.ui.rz0;
import org.telegram.ui.s40;
import org.telegram.ui.sn;
import org.telegram.ui.tg1;
import org.telegram.ui.u91;
import org.telegram.ui.vp0;
import org.telegram.ui.z70;
import org.telegram.ui.zl0;
import org.telegram.ui.zp0;
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
        org.telegram.ui.Components.qc j10;
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
                            g0Var.f26489f0 = !g0Var.f26489f0;
                        }
                    } else {
                        g0Var.f26488e0 = !g0Var.f26488e0;
                    }
                } else {
                    g0Var.f26487d0 = !g0Var.f26487d0;
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
                boolean z13 = ChatAttachAlertPhotoLayout.f24222q1;
                chatAttachAlertPhotoLayout.f28366b.f30714a1.getActionBarMenuOnItemClick().b(i13);
                chatAttachAlertPhotoLayout.f24266w.M(null, null);
                return;
            case 11:
                ((s40) obj).f31069b.x(i13, true);
                return;
            case 12:
                s40 s40Var = ((t30) obj).f30630c;
                s40Var.n(i13);
                s40Var.dismiss();
                return;
            case 13:
                ae0 ae0Var = (ae0) obj;
                if (ae0Var.e.getAdapter() instanceof yd0) {
                    tz tzVar = ((ly) ((yd0) ae0Var.e.getAdapter())).f28433c;
                    if ((i13 == 1 || i13 == 2) && tzVar.f31029w1) {
                        if (i13 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        tzVar.P(true, false, z10);
                        return;
                    } else if (i13 == 0 && tzVar.f31025v1) {
                        tzVar.P(true, true, false);
                        return;
                    }
                }
                ae0Var.e.x(i13, false);
                return;
            case 14:
                org.telegram.ui.Components.q4 q4Var = (org.telegram.ui.Components.q4) obj;
                EditTextBoldCursor editTextBoldCursor = q4Var.f31503c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                q4Var.d.run(Integer.valueOf(i13), editTextBoldCursor.getText().toString());
                q4Var.dismiss();
                return;
            case 15:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.g(view, i13, scrollSlidingTextTabStrip.f24491a.indexOfChild(view));
                return;
            case 16:
                p71 p71Var = (p71) obj;
                int i15 = p71Var.f29464b.f24455i.f29141q;
                if (i15 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    p71Var.updateAppUpdateViews(i13, true);
                    return;
                } else if (i15 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    p71Var.updateAppUpdateViews(i13, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", p71Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 17:
                ((org.telegram.ui.Components.voip.v0) obj).f31966b.x(i13, true);
                return;
            case 18:
                hh1 hh1Var = (hh1) obj;
                if (hh1Var.U == null && view.getAlpha() != 0.0f) {
                    hh1Var.c(i13, true);
                    return;
                }
                return;
            case 19:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i13);
                return;
            case 20:
                c80 c80Var = (c80) obj;
                c80Var.Q.dismiss();
                int i16 = c80Var.f36284c0;
                if (i16 >= 0) {
                    c80Var.f36285d0.setKeepMedia(i16, i13);
                    z70 z70Var = c80Var.f36286e0;
                    if (z70Var != null) {
                        z70Var.a(i13);
                        return;
                    }
                    return;
                }
                z70 z70Var2 = c80Var.f36286e0;
                if (z70Var2 != null) {
                    z70Var2.a(i13);
                    return;
                }
                return;
            case 21:
                rg0 rg0Var = (rg0) obj;
                ValueAnimator valueAnimator = rg0Var.f42433c.Q;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    tg1 tg1Var = rg0Var.f42433c;
                    if (!tg1Var.H) {
                        if (tg1Var.getCurrentPosition() == i13) {
                            org.telegram.ui.ActionBar.o2 X = rg0Var.X();
                            if (X instanceof qg0) {
                                ((qg0) X).t();
                                return;
                            }
                            return;
                        }
                        rg0Var.m0(i13, true);
                        rg0Var.f42433c.D(i13);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                an0 an0Var = (an0) obj;
                zl0 zl0Var = an0Var.D1;
                an0Var.S0 = i13;
                if (i13 == 1) {
                    an0Var.f35721i0 = an0Var.f35717g0;
                } else if (i13 == 4) {
                    an0Var.f35721i0 = an0Var.f35719h0;
                } else if (i13 == 2) {
                    an0Var.f35721i0 = an0Var.f35712e0;
                } else if (i13 == 3) {
                    an0Var.f35721i0 = an0Var.f35715f0;
                } else {
                    an0Var.f35721i0 = an0Var.f35710d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.u1().M2(null, an0Var, null);
                if (i13 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(an0Var.f35724j1);
                    PhotoViewer.u1().e2(arrayList, 0, zl0Var);
                    return;
                } else if (i13 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(an0Var.l1);
                    PhotoViewer.u1().e2(arrayList2, 0, zl0Var);
                    return;
                } else if (i13 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(an0Var.f35728m1);
                    PhotoViewer.u1().e2(arrayList3, 0, zl0Var);
                    return;
                } else if (i13 == 0) {
                    PhotoViewer u12 = PhotoViewer.u1();
                    ArrayList arrayList4 = an0Var.f35722i1;
                    u12.e2(arrayList4, arrayList4.indexOf(secureDocument), zl0Var);
                    return;
                } else {
                    PhotoViewer u13 = PhotoViewer.u1();
                    ArrayList arrayList5 = an0Var.f35726k1;
                    u13.e2(arrayList5, arrayList5.indexOf(secureDocument), zl0Var);
                    return;
                }
            case 23:
                vp0 vp0Var = (vp0) obj;
                org.telegram.ui.ActionBar.m1 m1Var = vp0Var.I;
                if (m1Var != null && m1Var.isShowing()) {
                    vp0Var.I.d(true);
                }
                if (i13 == 0) {
                    org.telegram.ui.Components.f5.L(vp0Var.getParentActivity(), vp0Var.F.a(), new mp0(vp0Var, 2));
                    return;
                }
                vp0Var.V(vp0Var.f42805b, vp0Var.f42806c, true, 0);
                vp0Var.finishFragment();
                return;
            case 24:
                mq0 mq0Var = (mq0) obj;
                org.telegram.ui.ActionBar.m1 m1Var2 = mq0Var.m0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    mq0Var.m0.d(true);
                }
                if (i13 == 0) {
                    org.telegram.ui.Components.f5.L(mq0Var.getParentActivity(), mq0Var.U.a(), new zp0(mq0Var, 1));
                    return;
                } else {
                    mq0Var.e0(0, true);
                    return;
                }
            case 25:
                MessageObject messageObject = (MessageObject) obj;
                int i17 = PopupNotificationActivity.f33787b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i13).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i13 == 0) {
                    rz0 rz0Var = profileActivity.O;
                    if (!rz0Var.C1) {
                        if (xv0.z0(rz0Var.getClosestTab())) {
                            rz0 rz0Var2 = profileActivity.O;
                            profileActivity.O.R0(profileActivity, profileActivity.a(), rz0Var2.k1(rz0Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            ei.vb D = ei.vb.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.f10038x = new qz0(profileActivity);
                            D.Q(null);
                            return;
                        }
                    }
                }
                if (xv0.z0(profileActivity.O.getClosestTab())) {
                    long a2 = profileActivity.a();
                    rz0 rz0Var3 = profileActivity.O;
                    int k12 = rz0Var3.k1(rz0Var3.getClosestTab());
                    String w9 = profileActivity.getMessagesController().getStoriesController().w(k12, a2);
                    org.telegram.messenger.s8 s8Var = profileActivity.f34065z5;
                    if (s8Var != null) {
                        s8Var.run();
                        profileActivity.f34065z5 = null;
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
                    profileActivity.O.M(false);
                    if (!arrayList6.isEmpty()) {
                        yb ybVar = new yb(profileActivity, a2, k12, arrayList6, 15);
                        profileActivity.getMessagesController().getStoriesController().c0(k12, a2, arrayList6);
                        org.telegram.ui.Components.xc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList6.size(), w9)), LocaleController.getString(R.string.UndoNoCaps), ybVar).j();
                        return;
                    }
                    return;
                }
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                org.telegram.messenger.s8 s8Var2 = profileActivity.f34065z5;
                if (s8Var2 != null) {
                    s8Var2.run();
                    profileActivity.f34065z5 = null;
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
                    profileActivity.f34065z5 = new org.telegram.messenger.s8(profileActivity, clientUserId, arrayList7, z14, 9);
                    z zVar = new z(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 15);
                    if (z14) {
                        j10 = org.telegram.ui.Components.xc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), zVar).j();
                    } else {
                        j10 = org.telegram.ui.Components.xc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, zVar).j();
                    }
                    j10.v = new mv0(14, profileActivity, zArr3);
                    return;
                }
                return;
            case 27:
                u91 u91Var = (u91) obj;
                u91Var.f42322i0.D(i13);
                u91Var.m0(i13, true);
                return;
            case 28:
                org.telegram.ui.Wallet.ia iaVar = (org.telegram.ui.Wallet.ia) obj;
                EditText editText = iaVar.f34619a;
                TextView[] textViewArr = iaVar.N;
                TextView textView = textViewArr[i13];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i13].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    iaVar.a();
                    iaVar.a();
                    Runnable runnable = iaVar.f34624r;
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
                ArrayList arrayList8 = k0Var.f52553n;
                if (i13 >= 0 && i13 < arrayList8.size()) {
                    k0Var.v = true;
                    k0Var.h.a(i13, true);
                    int i21 = ((zh.o) arrayList8.get(i13)).d;
                    int L0 = sVar.L0();
                    if ((sVar.m(i21) == null && Math.abs(i21 - L0) > k0Var.f52554r * 9) || !SharedConfig.animationsEnabled()) {
                        k0Var.f52551c.B0();
                        pl0 pl0Var = k0Var.f52552f;
                        if (L0 < i21) {
                            i12 = 0;
                        }
                        pl0Var.f29589b = i12;
                        pl0Var.c(i21, 0, false, false);
                        return;
                    }
                    s4.c0 c0Var = new s4.c0(k0Var.getContext());
                    c0Var.f46484a = ((zh.o) arrayList8.get(i13)).d;
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
