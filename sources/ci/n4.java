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
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bh0;
import org.telegram.ui.ch0;
import org.telegram.ui.d01;
import org.telegram.ui.e01;
import org.telegram.ui.fi1;
import org.telegram.ui.fq0;
import org.telegram.ui.jm0;
import org.telegram.ui.jq0;
import org.telegram.ui.kn0;
import org.telegram.ui.m80;
import org.telegram.ui.o80;
import org.telegram.ui.sh1;
import org.telegram.ui.va1;
import org.telegram.ui.wq0;
import org.telegram.ui.wx0;
import org.telegram.ui.xp0;
import org.telegram.ui.yn;
public final class n4 implements View.OnClickListener {
    public final int f5599a;
    public final int f5600b;
    public final Object f5601c;

    public n4(Object obj, int i10, int i11) {
        this.f5599a = i11;
        this.f5601c = obj;
        this.f5600b = i10;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        boolean z10;
        boolean z11;
        int i10;
        org.telegram.ui.Components.rc j3;
        int i11 = this.f5599a;
        int i12 = this.f5600b;
        Object obj = this.f5601c;
        switch (i11) {
            case 0:
                bb bbVar = (bb) obj;
                if (bbVar.f5965e.contains(Integer.valueOf(i12))) {
                    if (bbVar.f5965e.size() > 1) {
                        bbVar.f5965e.remove(Integer.valueOf(i12));
                    } else {
                        return;
                    }
                } else {
                    bbVar.f5965e.add(Integer.valueOf(i12));
                }
                AndroidUtilities.forEachViews((RecyclerView) bbVar.f5963b, (Utilities.Callback<View>) new ai.y1(bbVar, 10));
                return;
            case 1:
                u6 u6Var = ((s6) obj).f5915b;
                if (u6Var.f6070r && (callback = u6Var.f6068f) != null) {
                    callback.run(Integer.valueOf(i12));
                    return;
                }
                return;
            case 2:
                ((ii.e2) obj).P.a4(i12);
                return;
            case 3:
                View.OnClickListener onClickListener = ((jh.e) obj).f14141b[i12];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 4:
                jh.a aVar = ((jh.h) obj).h;
                if (aVar != null) {
                    aVar.h(i12);
                    return;
                }
                return;
            case 5:
                ((yn) obj).F9(i12);
                return;
            case 6:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            g0Var.f26614f0 = !g0Var.f26614f0;
                        }
                    } else {
                        g0Var.f26613e0 = !g0Var.f26613e0;
                    }
                } else {
                    g0Var.f26612d0 = !g0Var.f26612d0;
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
                boolean z13 = ChatAttachAlertPhotoLayout.f24018q1;
                chatAttachAlertPhotoLayout.f29643b.X0.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.f24062w.M(null, null);
                return;
            case 9:
                ((p30) obj).f29492b.x(i12, true);
                return;
            case 10:
                p30 p30Var = ((o30) obj).f29212c;
                p30Var.n(i12);
                p30Var.dismiss();
                return;
            case 11:
                qd0 qd0Var = (qd0) obj;
                if (qd0Var.f30004e.getAdapter() instanceof od0) {
                    nz nzVar = ((hy) ((od0) qd0Var.f30004e.getAdapter())).f27257c;
                    if ((i12 == 1 || i12 == 2) && nzVar.f29156w1) {
                        if (i12 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        nzVar.N(true, false, z10);
                        return;
                    } else if (i12 == 0 && nzVar.f29152v1) {
                        nzVar.N(true, true, false);
                        return;
                    }
                }
                qd0Var.f30004e.x(i12, false);
                return;
            case 12:
                org.telegram.ui.Components.q4 q4Var = (org.telegram.ui.Components.q4) obj;
                EditTextBoldCursor editTextBoldCursor = q4Var.f28397c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                q4Var.d.run(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                q4Var.dismiss();
                return;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i12, scrollSlidingTextTabStrip.f24301a.indexOfChild(view));
                return;
            case 14:
                k71 k71Var = (k71) obj;
                int i13 = k71Var.f27979b.f24263i.f26777q;
                if (i13 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    k71Var.updateAppUpdateViews(i12, true);
                    return;
                } else if (i13 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    k71Var.updateAppUpdateViews(i12, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", k71Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 15:
                ((org.telegram.ui.Components.voip.x0) obj).f32273b.x(i12, true);
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
                o80 o80Var = (o80) obj;
                o80Var.Q.dismiss();
                int i14 = o80Var.f39122c0;
                if (i14 >= 0) {
                    o80Var.f39123d0.setKeepMedia(i14, i12);
                    m80 m80Var = o80Var.f39124e0;
                    if (m80Var != null) {
                        m80Var.a(i12);
                        return;
                    }
                    return;
                }
                m80 m80Var2 = o80Var.f39124e0;
                if (m80Var2 != null) {
                    m80Var2.a(i12);
                    return;
                }
                return;
            case 19:
                ch0 ch0Var = (ch0) obj;
                ValueAnimator valueAnimator = ch0Var.f40849c.R;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    sh1 sh1Var = ch0Var.f40849c;
                    if (!sh1Var.H) {
                        if (sh1Var.getCurrentPosition() == i12) {
                            org.telegram.ui.ActionBar.n2 W = ch0Var.W();
                            if (W instanceof bh0) {
                                ((bh0) W).r();
                                return;
                            }
                            return;
                        }
                        ch0Var.m0(i12, true);
                        ch0Var.f40849c.E(i12);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                kn0 kn0Var = (kn0) obj;
                jm0 jm0Var = kn0Var.D1;
                kn0Var.S0 = i12;
                if (i12 == 1) {
                    kn0Var.f38025i0 = kn0Var.f38021g0;
                } else if (i12 == 4) {
                    kn0Var.f38025i0 = kn0Var.f38023h0;
                } else if (i12 == 2) {
                    kn0Var.f38025i0 = kn0Var.f38016e0;
                } else if (i12 == 3) {
                    kn0Var.f38025i0 = kn0Var.f38019f0;
                } else {
                    kn0Var.f38025i0 = kn0Var.f38013d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, kn0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(kn0Var.f38028j1);
                    PhotoViewer.t1().c2(arrayList, 0, jm0Var);
                    return;
                } else if (i12 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(kn0Var.l1);
                    PhotoViewer.t1().c2(arrayList2, 0, jm0Var);
                    return;
                } else if (i12 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(kn0Var.f38032m1);
                    PhotoViewer.t1().c2(arrayList3, 0, jm0Var);
                    return;
                } else if (i12 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = kn0Var.f38026i1;
                    t12.c2(arrayList4, arrayList4.indexOf(secureDocument), jm0Var);
                    return;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = kn0Var.f38030k1;
                    t13.c2(arrayList5, arrayList5.indexOf(secureDocument), jm0Var);
                    return;
                }
            case 21:
                fq0 fq0Var = (fq0) obj;
                org.telegram.ui.ActionBar.n1 n1Var = fq0Var.I;
                if (n1Var != null && n1Var.isShowing()) {
                    fq0Var.I.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.e5.L(fq0Var.getParentActivity(), fq0Var.F.a(), new xp0(fq0Var, 2));
                    return;
                }
                fq0Var.T(fq0Var.f36362b, fq0Var.f36363c, true, 0);
                fq0Var.finishFragment();
                return;
            case 22:
                wq0 wq0Var = (wq0) obj;
                org.telegram.ui.ActionBar.n1 n1Var2 = wq0Var.m0;
                if (n1Var2 != null && n1Var2.isShowing()) {
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
                int i15 = PopupNotificationActivity.f34103b0;
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
                        if (pv0.w0(e01Var.getClosestTab())) {
                            e01 e01Var2 = profileActivity.O;
                            profileActivity.O.O0(profileActivity, profileActivity.a(), e01Var2.h1(e01Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            kc E = kc.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.f5448x = new d01(profileActivity);
                            E.R(null);
                            return;
                        }
                    }
                }
                if (pv0.w0(profileActivity.O.getClosestTab())) {
                    long a2 = profileActivity.a();
                    e01 e01Var3 = profileActivity.O;
                    int h12 = e01Var3.h1(e01Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.o8 o8Var = profileActivity.f34370x5;
                    if (o8Var != null) {
                        o8Var.run();
                        profileActivity.f34370x5 = null;
                    }
                    org.telegram.ui.Components.rc.e();
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
                        org.telegram.messenger.g7 g7Var = new org.telegram.messenger.g7(profileActivity, a2, h12, arrayList6, 14);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList6);
                        org.telegram.ui.Components.yc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList6.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), g7Var).j();
                        return;
                    }
                    return;
                }
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                org.telegram.messenger.o8 o8Var2 = profileActivity.f34370x5;
                if (o8Var2 != null) {
                    o8Var2.run();
                    profileActivity.f34370x5 = null;
                }
                org.telegram.ui.Components.rc.e();
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
                    profileActivity.f34370x5 = new org.telegram.messenger.o8(profileActivity, clientUserId, arrayList7, z11, 9);
                    org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 7);
                    if (z14) {
                        j3 = org.telegram.ui.Components.yc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), fVar).j();
                    } else {
                        j3 = org.telegram.ui.Components.yc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, fVar).j();
                    }
                    j3.v = new wx0(9, profileActivity, zArr3);
                    return;
                }
                return;
            case 25:
                va1 va1Var = (va1) obj;
                va1Var.f41650h0.E(i12);
                va1Var.k0(i12, true);
                return;
            case 26:
                yh.r0 r0Var = ((yh.s0) obj).f51937j0;
                int i19 = yh.r0.f51878s;
                r0Var.a(i12);
                return;
            default:
                ((yh.r0) obj).a(i12);
                return;
        }
    }

    public n4(MessageObject messageObject, int i10) {
        this.f5599a = 23;
        this.f5600b = i10;
        this.f5601c = messageObject;
    }
}
