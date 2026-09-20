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
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.l30;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.cr0;
import org.telegram.ui.dq0;
import org.telegram.ui.fh0;
import org.telegram.ui.gh0;
import org.telegram.ui.k01;
import org.telegram.ui.l01;
import org.telegram.ui.lq0;
import org.telegram.ui.mi1;
import org.telegram.ui.n80;
import org.telegram.ui.om0;
import org.telegram.ui.p80;
import org.telegram.ui.pn0;
import org.telegram.ui.pq0;
import org.telegram.ui.rx0;
import org.telegram.ui.zh1;
import org.telegram.ui.zn;
public final class o4 implements View.OnClickListener {
    public final int f5127a;
    public final int f5128b;
    public final Object f5129c;

    public o4(Object obj, int i10, int i11) {
        this.f5127a = i11;
        this.f5129c = obj;
        this.f5128b = i10;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        boolean z10;
        boolean z11;
        int i10;
        org.telegram.ui.Components.pc j3;
        int i11 = this.f5127a;
        int i12 = this.f5128b;
        Object obj = this.f5129c;
        switch (i11) {
            case 0:
                fb fbVar = (fb) obj;
                if (fbVar.e.contains(Integer.valueOf(i12))) {
                    if (fbVar.e.size() > 1) {
                        fbVar.e.remove(Integer.valueOf(i12));
                    } else {
                        return;
                    }
                } else {
                    fbVar.e.add(Integer.valueOf(i12));
                }
                AndroidUtilities.forEachViews((RecyclerView) fbVar.f5612b, (e2.h) new ai.f3(fbVar, 3));
                return;
            case 1:
                v6 v6Var = ((t6) obj).f5571b;
                if (v6Var.f5662r && (callback = v6Var.f5660f) != null) {
                    callback.run(Integer.valueOf(i12));
                    return;
                }
                return;
            case 2:
                ((ii.d2) obj).P.Z3(i12);
                return;
            case 3:
                View.OnClickListener onClickListener = ((jh.e) obj).f13020b[i12];
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
                ((zn) obj).G9(i12);
                return;
            case 6:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            g0Var.f24218f0 = !g0Var.f24218f0;
                        }
                    } else {
                        g0Var.f24217e0 = !g0Var.f24217e0;
                    }
                } else {
                    g0Var.f24216d0 = !g0Var.f24216d0;
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
                boolean z13 = ChatAttachAlertPhotoLayout.f22119q1;
                chatAttachAlertPhotoLayout.f26655b.X0.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.f22163w.M(null, null);
                return;
            case 9:
                ((l30) obj).f26006b.x(i12, true);
                return;
            case 10:
                l30 l30Var = ((k30) obj).f25644c;
                l30Var.n(i12);
                l30Var.dismiss();
                return;
            case 11:
                md0 md0Var = (md0) obj;
                if (md0Var.e.getAdapter() instanceof kd0) {
                    kz kzVar = ((ey) ((kd0) md0Var.e.getAdapter())).f23951c;
                    if ((i12 == 1 || i12 == 2) && kzVar.f25961w1) {
                        if (i12 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        kzVar.P(true, false, z10);
                        return;
                    } else if (i12 == 0 && kzVar.f25957v1) {
                        kzVar.P(true, true, false);
                        return;
                    }
                }
                md0Var.e.x(i12, false);
                return;
            case 12:
                org.telegram.ui.Components.p4 p4Var = (org.telegram.ui.Components.p4) obj;
                EditTextBoldCursor editTextBoldCursor = p4Var.f23880c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                p4Var.d.run(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                p4Var.dismiss();
                return;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i12, scrollSlidingTextTabStrip.f22387a.indexOfChild(view));
                return;
            case 14:
                z61 z61Var = (z61) obj;
                int i13 = z61Var.f30768b.f22351i.f22626q;
                if (i13 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    z61Var.updateAppUpdateViews(i12, true);
                    return;
                } else if (i13 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    z61Var.updateAppUpdateViews(i12, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", z61Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 15:
                ((org.telegram.ui.Components.voip.x0) obj).f29744b.x(i12, true);
                return;
            case 16:
                mi1 mi1Var = (mi1) obj;
                if (mi1Var.U == null && view.getAlpha() != 0.0f) {
                    mi1Var.c(i12, true);
                    return;
                }
                return;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i12);
                return;
            case 18:
                p80 p80Var = (p80) obj;
                p80Var.Q.dismiss();
                int i14 = p80Var.f36492c0;
                if (i14 >= 0) {
                    p80Var.f36493d0.setKeepMedia(i14, i12);
                    n80 n80Var = p80Var.f36494e0;
                    if (n80Var != null) {
                        n80Var.a(i12);
                        return;
                    }
                    return;
                }
                n80 n80Var2 = p80Var.f36494e0;
                if (n80Var2 != null) {
                    n80Var2.a(i12);
                    return;
                }
                return;
            case 19:
                gh0 gh0Var = (gh0) obj;
                ValueAnimator valueAnimator = gh0Var.f32102c.R;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    zh1 zh1Var = gh0Var.f32102c;
                    if (!zh1Var.H) {
                        if (zh1Var.getCurrentPosition() == i12) {
                            org.telegram.ui.ActionBar.n2 X = gh0Var.X();
                            if (X instanceof fh0) {
                                ((fh0) X).r();
                                return;
                            }
                            return;
                        }
                        gh0Var.m0(i12, true);
                        gh0Var.f32102c.E(i12);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                pn0 pn0Var = (pn0) obj;
                om0 om0Var = pn0Var.D1;
                pn0Var.S0 = i12;
                if (i12 == 1) {
                    pn0Var.f36621i0 = pn0Var.f36617g0;
                } else if (i12 == 4) {
                    pn0Var.f36621i0 = pn0Var.f36619h0;
                } else if (i12 == 2) {
                    pn0Var.f36621i0 = pn0Var.f36612e0;
                } else if (i12 == 3) {
                    pn0Var.f36621i0 = pn0Var.f36615f0;
                } else {
                    pn0Var.f36621i0 = pn0Var.f36610d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().J2(null, pn0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(pn0Var.f36624j1);
                    PhotoViewer.t1().b2(arrayList, 0, om0Var);
                    return;
                } else if (i12 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(pn0Var.l1);
                    PhotoViewer.t1().b2(arrayList2, 0, om0Var);
                    return;
                } else if (i12 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(pn0Var.f36628m1);
                    PhotoViewer.t1().b2(arrayList3, 0, om0Var);
                    return;
                } else if (i12 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = pn0Var.f36622i1;
                    t12.b2(arrayList4, arrayList4.indexOf(secureDocument), om0Var);
                    return;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = pn0Var.f36626k1;
                    t13.b2(arrayList5, arrayList5.indexOf(secureDocument), om0Var);
                    return;
                }
            case 21:
                lq0 lq0Var = (lq0) obj;
                org.telegram.ui.ActionBar.n1 n1Var = lq0Var.I;
                if (n1Var != null && n1Var.isShowing()) {
                    lq0Var.I.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.d5.L(lq0Var.getParentActivity(), lq0Var.F.a(), new dq0(lq0Var, 2));
                    return;
                }
                lq0Var.V(lq0Var.f35506b, lq0Var.f35507c, true, 0);
                lq0Var.finishFragment();
                return;
            case 22:
                cr0 cr0Var = (cr0) obj;
                org.telegram.ui.ActionBar.n1 n1Var2 = cr0Var.m0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    cr0Var.m0.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.d5.L(cr0Var.getParentActivity(), cr0Var.U.a(), new pq0(cr0Var, 1));
                    return;
                } else {
                    cr0Var.e0(0, true);
                    return;
                }
            case 23:
                MessageObject messageObject = (MessageObject) obj;
                int i15 = PopupNotificationActivity.f31427b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i12).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i12 == 0) {
                    l01 l01Var = profileActivity.O;
                    if (!l01Var.C1) {
                        if (jv0.w0(l01Var.getClosestTab())) {
                            l01 l01Var2 = profileActivity.O;
                            profileActivity.O.O0(profileActivity, profileActivity.a(), l01Var2.h1(l01Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            oc E = oc.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.f5279x = new k01(profileActivity);
                            E.R(null);
                            return;
                        }
                    }
                }
                if (jv0.w0(profileActivity.O.getClosestTab())) {
                    long a2 = profileActivity.a();
                    l01 l01Var3 = profileActivity.O;
                    int h12 = l01Var3.h1(l01Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.t8 t8Var = profileActivity.f31689x5;
                    if (t8Var != null) {
                        t8Var.run();
                        profileActivity.f31689x5 = null;
                    }
                    org.telegram.ui.Components.pc.e();
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
                        org.telegram.messenger.j7 j7Var = new org.telegram.messenger.j7(profileActivity, a2, h12, arrayList6, 13);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList6);
                        org.telegram.ui.Components.xc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList6.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), j7Var).j();
                        return;
                    }
                    return;
                }
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                org.telegram.messenger.t8 t8Var2 = profileActivity.f31689x5;
                if (t8Var2 != null) {
                    t8Var2.run();
                    profileActivity.f31689x5 = null;
                }
                org.telegram.ui.Components.pc.e();
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
                    profileActivity.f31689x5 = new org.telegram.messenger.t8(profileActivity, clientUserId, arrayList7, z11, 9);
                    org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 7);
                    if (z14) {
                        j3 = org.telegram.ui.Components.xc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), fVar).j();
                    } else {
                        j3 = org.telegram.ui.Components.xc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, fVar).j();
                    }
                    j3.v = new rx0(12, profileActivity, zArr3);
                    return;
                }
                return;
            case 25:
                bb1 bb1Var = (bb1) obj;
                bb1Var.f32325i0.E(i12);
                bb1Var.m0(i12, true);
                return;
            case 26:
                yh.r0 r0Var = ((yh.s0) obj).f48016j0;
                int i19 = yh.r0.f47980s;
                r0Var.a(i12);
                return;
            default:
                ((yh.r0) obj).a(i12);
                return;
        }
    }

    public o4(MessageObject messageObject, int i10) {
        this.f5127a = 23;
        this.f5128b = i10;
        this.f5129c = messageObject;
    }
}
