package jh;

import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import nh.gb;
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
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.h30;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.xc0;
import org.telegram.ui.Components.xx;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.av0;
import org.telegram.ui.gz0;
import org.telegram.ui.hh1;
import org.telegram.ui.hp0;
import org.telegram.ui.hz0;
import org.telegram.ui.lp0;
import org.telegram.ui.mg0;
import org.telegram.ui.ng0;
import org.telegram.ui.t91;
import org.telegram.ui.tn;
import org.telegram.ui.ug1;
import org.telegram.ui.ul0;
import org.telegram.ui.v70;
import org.telegram.ui.vm0;
import org.telegram.ui.x70;
import org.telegram.ui.zo0;
import org.telegram.ui.zp0;
public final class y0 implements View.OnClickListener {
    public final int f13104a;
    public final int f13105b;
    public final Object f13106c;

    public y0(Object obj, int i10, int i11) {
        this.f13104a = i11;
        this.f13106c = obj;
        this.f13105b = i10;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        boolean z10;
        boolean z11;
        int i10;
        mc j10;
        int i11 = this.f13104a;
        int i12 = this.f13105b;
        Object obj = this.f13106c;
        switch (i11) {
            case 0:
                i1 i1Var = ((j1) obj).f12288f0;
                int i13 = i1.f12232s;
                i1Var.a(i12);
                return;
            case 1:
                ((i1) obj).a(i12);
                return;
            case 2:
                nh.y9 y9Var = (nh.y9) obj;
                if (y9Var.f17696e.contains(Integer.valueOf(i12))) {
                    if (y9Var.f17696e.size() > 1) {
                        y9Var.f17696e.remove(Integer.valueOf(i12));
                    } else {
                        return;
                    }
                } else {
                    y9Var.f17696e.add(Integer.valueOf(i12));
                }
                AndroidUtilities.forEachViews((RecyclerView) y9Var.f17694b, (f5.d) new kg.i(y9Var, 4));
                return;
            case 3:
                nh.w5 w5Var = ((nh.u5) obj).f18721b;
                if (w5Var.f18794r && (callback = w5Var.f18792f) != null) {
                    callback.run(Integer.valueOf(i12));
                    return;
                }
                return;
            case 4:
                ((tn) obj).G9(i12);
                return;
            case 5:
                org.telegram.ui.Components.i0 i0Var = (org.telegram.ui.Components.i0) obj;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            i0Var.f29290b0 = !i0Var.f29290b0;
                        }
                    } else {
                        i0Var.f29289a0 = !i0Var.f29289a0;
                    }
                } else {
                    i0Var.Z = !i0Var.Z;
                }
                i0Var.T.N(true);
                i0Var.s();
                return;
            case 6:
                boolean[] zArr = (boolean[]) obj;
                boolean z12 = !zArr[i12];
                zArr[i12] = z12;
                ((org.telegram.ui.Cells.y1) view).c(z12, true);
                return;
            case 7:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f26252m1;
                chatAttachAlertPhotoLayout.f28403b.T0.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.f26292w.M(null, null);
                return;
            case 8:
                ((i30) obj).f29306b.x(i12, true);
                return;
            case 9:
                i30 i30Var = ((h30) obj).f29049c;
                i30Var.n(i12);
                i30Var.dismiss();
                return;
            case 10:
                zc0 zc0Var = (zc0) obj;
                if (zc0Var.f35316e.getAdapter() instanceof xc0) {
                    fz fzVar = ((xx) ((xc0) zc0Var.f35316e.getAdapter())).f34840c;
                    if ((i12 == 1 || i12 == 2) && fzVar.f28634s1) {
                        if (i12 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        fzVar.R(true, false, z10);
                        return;
                    } else if (i12 == 0 && fzVar.f28630r1) {
                        fzVar.R(true, true, false);
                        return;
                    }
                }
                zc0Var.f35316e.x(i12, false);
                return;
            case 11:
                org.telegram.ui.Components.o4 o4Var = (org.telegram.ui.Components.o4) obj;
                EditTextBoldCursor editTextBoldCursor = o4Var.f32688c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                o4Var.d.run(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                o4Var.dismiss();
                return;
            case 12:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i12, scrollSlidingTextTabStrip.f26523a.indexOfChild(view));
                return;
            case 13:
                c61 c61Var = (c61) obj;
                int i14 = c61Var.f27352b.f26485i.f31311q;
                if (i14 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    c61Var.updateAppUpdateViews(i12, true);
                    return;
                } else if (i14 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    c61Var.updateAppUpdateViews(i12, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", c61Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 14:
                ((org.telegram.ui.Components.voip.v0) obj).f34068b.x(i12, true);
                return;
            case 15:
                hh1 hh1Var = (hh1) obj;
                if (hh1Var.Q == null && view.getAlpha() != 0.0f) {
                    hh1Var.c(i12, true);
                    return;
                }
                return;
            case 16:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i12);
                return;
            case 17:
                x70 x70Var = (x70) obj;
                x70Var.M.dismiss();
                int i15 = x70Var.V;
                if (i15 >= 0) {
                    x70Var.W.setKeepMedia(i15, i12);
                    v70 v70Var = x70Var.f44509a0;
                    if (v70Var != null) {
                        v70Var.a(i12);
                        return;
                    }
                    return;
                }
                v70 v70Var2 = x70Var.f44509a0;
                if (v70Var2 != null) {
                    v70Var2.a(i12);
                    return;
                }
                return;
            case 18:
                ng0 ng0Var = (ng0) obj;
                ValueAnimator valueAnimator = ng0Var.f43594c.M;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    ug1 ug1Var = ng0Var.f43594c;
                    if (!ug1Var.D) {
                        if (ug1Var.getCurrentPosition() == i12) {
                            org.telegram.ui.ActionBar.o2 X = ng0Var.X();
                            if (X instanceof mg0) {
                                ((mg0) X).s();
                                return;
                            }
                            return;
                        }
                        ng0Var.m0(i12, true);
                        ng0Var.f43594c.D(i12);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                vm0 vm0Var = (vm0) obj;
                ul0 ul0Var = vm0Var.f43682z1;
                vm0Var.O0 = i12;
                if (i12 == 1) {
                    vm0Var.f43634e0 = vm0Var.f43629c0;
                } else if (i12 == 4) {
                    vm0Var.f43634e0 = vm0Var.f43631d0;
                } else if (i12 == 2) {
                    vm0Var.f43634e0 = vm0Var.f43623a0;
                } else if (i12 == 3) {
                    vm0Var.f43634e0 = vm0Var.f43626b0;
                } else {
                    vm0Var.f43634e0 = vm0Var.Z;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, vm0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(vm0Var.f43638f1);
                    PhotoViewer.t1().b2(arrayList, 0, ul0Var);
                    return;
                } else if (i12 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(vm0Var.f43642h1);
                    PhotoViewer.t1().b2(arrayList2, 0, ul0Var);
                    return;
                } else if (i12 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(vm0Var.f43644i1);
                    PhotoViewer.t1().b2(arrayList3, 0, ul0Var);
                    return;
                } else if (i12 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = vm0Var.f43635e1;
                    t12.b2(arrayList4, arrayList4.indexOf(secureDocument), ul0Var);
                    return;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = vm0Var.f43640g1;
                    t13.b2(arrayList5, arrayList5.indexOf(secureDocument), ul0Var);
                    return;
                }
            case 20:
                hp0 hp0Var = (hp0) obj;
                org.telegram.ui.ActionBar.o1 o1Var = hp0Var.E;
                if (o1Var != null && o1Var.isShowing()) {
                    hp0Var.E.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.c5.L(hp0Var.getParentActivity(), hp0Var.B.a(), new zo0(hp0Var, 2));
                    return;
                }
                hp0Var.V(hp0Var.f38985b, hp0Var.f38986c, true, 0);
                hp0Var.finishFragment();
                return;
            case 21:
                zp0 zp0Var = (zp0) obj;
                org.telegram.ui.ActionBar.o1 o1Var2 = zp0Var.f45284i0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    zp0Var.f45284i0.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.c5.L(zp0Var.getParentActivity(), zp0Var.Q.a(), new lp0(zp0Var, 1));
                    return;
                } else {
                    zp0Var.e0(0, true);
                    return;
                }
            case 22:
                MessageObject messageObject = (MessageObject) obj;
                int i16 = PopupNotificationActivity.X;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i12).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i12 == 0) {
                    hz0 hz0Var = profileActivity.K;
                    if (!hz0Var.f32111y1) {
                        if (qu0.w0(hz0Var.getClosestTab())) {
                            hz0 hz0Var2 = profileActivity.K;
                            profileActivity.K.O0(profileActivity, profileActivity.a(), hz0Var2.h1(hz0Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            gb E = gb.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.f17811x = new gz0(profileActivity);
                            E.R(null);
                            return;
                        }
                    }
                }
                if (qu0.w0(profileActivity.K.getClosestTab())) {
                    long a2 = profileActivity.a();
                    hz0 hz0Var3 = profileActivity.K;
                    int h12 = hz0Var3.h1(hz0Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.v8 v8Var = profileActivity.f36122t5;
                    if (v8Var != null) {
                        v8Var.run();
                        profileActivity.f36122t5 = null;
                    }
                    mc.e();
                    ArrayList arrayList6 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.K.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i17 = 0; i17 < actionModeSelected.size(); i17++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i17).storyItem;
                            if (storyItem != null) {
                                arrayList6.add(storyItem);
                            }
                        }
                    }
                    profileActivity.K.L(false);
                    if (!arrayList6.isEmpty()) {
                        x8 x8Var = new x8(profileActivity, a2, h12, arrayList6, 14);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList6);
                        tc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList6.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), x8Var).j();
                        return;
                    }
                    return;
                }
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                org.telegram.messenger.v8 v8Var2 = profileActivity.f36122t5;
                if (v8Var2 != null) {
                    v8Var2.run();
                    profileActivity.f36122t5 = null;
                }
                mc.e();
                if (profileActivity.K.getClosestTab() == 9) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ArrayList arrayList7 = new ArrayList();
                SparseArray<MessageObject> actionModeSelected2 = profileActivity.K.getActionModeSelected();
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
                profileActivity.K.L(false);
                if (z11) {
                    profileActivity.K.Y0(8);
                }
                if (!arrayList7.isEmpty()) {
                    boolean[] zArr2 = new boolean[arrayList7.size()];
                    for (int i19 = 0; i19 < arrayList7.size(); i19++) {
                        TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) arrayList7.get(i19);
                        zArr2[i19] = storyItem3.pinned;
                        storyItem3.pinned = z11;
                    }
                    profileActivity.getMessagesController().getStoriesController().n0(clientUserId, arrayList7, false);
                    boolean[] zArr3 = {false};
                    boolean z14 = z11;
                    profileActivity.f36122t5 = new org.telegram.messenger.v8(profileActivity, clientUserId, arrayList7, z14, 9);
                    ih.h1 h1Var = new ih.h1(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 15);
                    if (z14) {
                        j10 = tc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), h1Var).j();
                    } else {
                        j10 = tc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, h1Var).j();
                    }
                    j10.v = new av0(15, profileActivity, zArr3);
                    return;
                }
                return;
            case 24:
                t91 t91Var = (t91) obj;
                t91Var.f42596e0.D(i12);
                t91Var.m0(i12, true);
                return;
            case 25:
                ((th.x1) obj).L.Y3(i12);
                return;
            case 26:
                View.OnClickListener onClickListener = ((ug.e) obj).f49217b[i12];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                ug.a aVar = ((ug.g) obj).h;
                if (aVar != null) {
                    aVar.k(i12);
                    return;
                }
                return;
        }
    }

    public y0(MessageObject messageObject, int i10) {
        this.f13104a = 22;
        this.f13105b = i10;
        this.f13106c = messageObject;
    }
}
