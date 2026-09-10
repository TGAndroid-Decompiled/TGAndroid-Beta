package bi;

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
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.y61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.br0;
import org.telegram.ui.cq0;
import org.telegram.ui.eh0;
import org.telegram.ui.eo;
import org.telegram.ui.ey0;
import org.telegram.ui.fb1;
import org.telegram.ui.fh0;
import org.telegram.ui.fi1;
import org.telegram.ui.kq0;
import org.telegram.ui.n80;
import org.telegram.ui.nm0;
import org.telegram.ui.on0;
import org.telegram.ui.oq0;
import org.telegram.ui.p80;
import org.telegram.ui.q01;
import org.telegram.ui.r01;
import org.telegram.ui.si1;
public final class j5 implements View.OnClickListener {
    public final int f2957a;
    public final int f2958b;
    public final Object f2959c;

    public j5(Object obj, int i10, int i11) {
        this.f2957a = i11;
        this.f2959c = obj;
        this.f2958b = i10;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        boolean z10;
        boolean z11;
        int i10;
        org.telegram.ui.Components.pc j3;
        int i11 = this.f2957a;
        int i12 = this.f2958b;
        Object obj = this.f2959c;
        switch (i11) {
            case 0:
                oc ocVar = (oc) obj;
                if (ocVar.e.contains(Integer.valueOf(i12))) {
                    if (ocVar.e.size() > 1) {
                        ocVar.e.remove(Integer.valueOf(i12));
                    } else {
                        return;
                    }
                } else {
                    ocVar.e.add(Integer.valueOf(i12));
                }
                AndroidUtilities.forEachViews((RecyclerView) ocVar.f3388b, (e2.h) new i5(ocVar, 0));
                return;
            case 1:
                v7 v7Var = ((t7) obj).f3684b;
                if (v7Var.f3796r && (callback = v7Var.f3794f) != null) {
                    callback.run(Integer.valueOf(i12));
                    return;
                }
                return;
            case 2:
                ((hi.g2) obj).P.X3(i12);
                return;
            case 3:
                View.OnClickListener onClickListener = ((ih.e) obj).f10608b[i12];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 4:
                ih.a aVar = ((ih.h) obj).h;
                if (aVar != null) {
                    aVar.i(i12);
                    return;
                }
                return;
            case 5:
                ((eo) obj).G9(i12);
                return;
            case 6:
                org.telegram.ui.Components.i0 i0Var = (org.telegram.ui.Components.i0) obj;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            i0Var.f23842f0 = !i0Var.f23842f0;
                        }
                    } else {
                        i0Var.f23841e0 = !i0Var.f23841e0;
                    }
                } else {
                    i0Var.f23840d0 = !i0Var.f23840d0;
                }
                i0Var.X.N(true);
                i0Var.s();
                return;
            case 7:
                boolean[] zArr = (boolean[]) obj;
                boolean z12 = !zArr[i12];
                zArr[i12] = z12;
                ((org.telegram.ui.Cells.z1) view).c(z12, true);
                return;
            case 8:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f20983q1;
                chatAttachAlertPhotoLayout.f26422b.X0.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.f21027w.M(null, null);
                return;
            case 9:
                ((v30) obj).f27806b.x(i12, true);
                return;
            case 10:
                v30 v30Var = ((u30) obj).f27557c;
                v30Var.n(i12);
                v30Var.dismiss();
                return;
            case 11:
                nd0 nd0Var = (nd0) obj;
                if (nd0Var.e.getAdapter() instanceof kd0) {
                    rz rzVar = ((ky) ((kd0) nd0Var.e.getAdapter())).f24826c;
                    if ((i12 == 1 || i12 == 2) && rzVar.f26868w1) {
                        if (i12 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        rzVar.R(true, false, z10);
                        return;
                    } else if (i12 == 0 && rzVar.f26864v1) {
                        rzVar.R(true, true, false);
                        return;
                    }
                }
                nd0Var.e.x(i12, false);
                return;
            case 12:
                org.telegram.ui.Components.p4 p4Var = (org.telegram.ui.Components.p4) obj;
                EditTextBoldCursor editTextBoldCursor = p4Var.f22729c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                p4Var.d.run(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                p4Var.dismiss();
                return;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i12, scrollSlidingTextTabStrip.f21251a.indexOfChild(view));
                return;
            case 14:
                y61 y61Var = (y61) obj;
                int i13 = y61Var.f29258b.f21215i.f22080q;
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
                ((org.telegram.ui.Components.voip.w0) obj).f28506b.x(i12, true);
                return;
            case 16:
                si1 si1Var = (si1) obj;
                if (si1Var.U == null && view.getAlpha() != 0.0f) {
                    si1Var.c(i12, true);
                    return;
                }
                return;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i12);
                return;
            case 18:
                p80 p80Var = (p80) obj;
                p80Var.Q.dismiss();
                int i14 = p80Var.f35701c0;
                if (i14 >= 0) {
                    p80Var.f35702d0.setKeepMedia(i14, i12);
                    n80 n80Var = p80Var.f35703e0;
                    if (n80Var != null) {
                        n80Var.a(i12);
                        return;
                    }
                    return;
                }
                n80 n80Var2 = p80Var.f35703e0;
                if (n80Var2 != null) {
                    n80Var2.a(i12);
                    return;
                }
                return;
            case 19:
                fh0 fh0Var = (fh0) obj;
                ValueAnimator valueAnimator = fh0Var.f33117c.Q;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    fi1 fi1Var = fh0Var.f33117c;
                    if (!fi1Var.H) {
                        if (fi1Var.getCurrentPosition() == i12) {
                            org.telegram.ui.ActionBar.p2 X = fh0Var.X();
                            if (X instanceof eh0) {
                                ((eh0) X).r();
                                return;
                            }
                            return;
                        }
                        fh0Var.m0(i12, true);
                        fh0Var.f33117c.D(i12);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                on0 on0Var = (on0) obj;
                nm0 nm0Var = on0Var.D1;
                on0Var.S0 = i12;
                if (i12 == 1) {
                    on0Var.f35537i0 = on0Var.f35533g0;
                } else if (i12 == 4) {
                    on0Var.f35537i0 = on0Var.f35535h0;
                } else if (i12 == 2) {
                    on0Var.f35537i0 = on0Var.f35528e0;
                } else if (i12 == 3) {
                    on0Var.f35537i0 = on0Var.f35531f0;
                } else {
                    on0Var.f35537i0 = on0Var.f35526d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, on0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(on0Var.f35540j1);
                    PhotoViewer.t1().b2(arrayList, 0, nm0Var);
                    return;
                } else if (i12 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(on0Var.l1);
                    PhotoViewer.t1().b2(arrayList2, 0, nm0Var);
                    return;
                } else if (i12 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(on0Var.f35544m1);
                    PhotoViewer.t1().b2(arrayList3, 0, nm0Var);
                    return;
                } else if (i12 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = on0Var.f35538i1;
                    t12.b2(arrayList4, arrayList4.indexOf(secureDocument), nm0Var);
                    return;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = on0Var.f35542k1;
                    t13.b2(arrayList5, arrayList5.indexOf(secureDocument), nm0Var);
                    return;
                }
            case 21:
                kq0 kq0Var = (kq0) obj;
                org.telegram.ui.ActionBar.p1 p1Var = kq0Var.I;
                if (p1Var != null && p1Var.isShowing()) {
                    kq0Var.I.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.d5.L(kq0Var.getParentActivity(), kq0Var.F.a(), new cq0(kq0Var, 2));
                    return;
                }
                kq0Var.V(kq0Var.f34439b, kq0Var.f34440c, true, 0);
                kq0Var.finishFragment();
                return;
            case 22:
                br0 br0Var = (br0) obj;
                org.telegram.ui.ActionBar.p1 p1Var2 = br0Var.m0;
                if (p1Var2 != null && p1Var2.isShowing()) {
                    br0Var.m0.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.d5.L(br0Var.getParentActivity(), br0Var.U.a(), new oq0(br0Var, 1));
                    return;
                } else {
                    br0Var.e0(0, true);
                    return;
                }
            case 23:
                MessageObject messageObject = (MessageObject) obj;
                int i15 = PopupNotificationActivity.f30255b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i12).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i12 == 0) {
                    r01 r01Var = profileActivity.O;
                    if (!r01Var.C1) {
                        if (iv0.w0(r01Var.getClosestTab())) {
                            r01 r01Var2 = profileActivity.O;
                            profileActivity.O.O0(profileActivity, profileActivity.a(), r01Var2.h1(r01Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            ce E = ce.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.f2504x = new q01(profileActivity);
                            E.R(null);
                            return;
                        }
                    }
                }
                if (iv0.w0(profileActivity.O.getClosestTab())) {
                    long a2 = profileActivity.a();
                    r01 r01Var3 = profileActivity.O;
                    int h12 = r01Var3.h1(r01Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.a9 a9Var = profileActivity.f30517x5;
                    if (a9Var != null) {
                        a9Var.run();
                        profileActivity.f30517x5 = null;
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
                        org.telegram.messenger.p7 p7Var = new org.telegram.messenger.p7(profileActivity, a2, h12, arrayList6, 13);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList6);
                        org.telegram.ui.Components.wc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList6.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), p7Var).j();
                        return;
                    }
                    return;
                }
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                org.telegram.messenger.a9 a9Var2 = profileActivity.f30517x5;
                if (a9Var2 != null) {
                    a9Var2.run();
                    profileActivity.f30517x5 = null;
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
                    profileActivity.f30517x5 = new org.telegram.messenger.a9(profileActivity, clientUserId, arrayList7, z11, 9);
                    org.telegram.messenger.voip.g gVar = new org.telegram.messenger.voip.g(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 7);
                    if (z14) {
                        j3 = org.telegram.ui.Components.wc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), gVar).j();
                    } else {
                        j3 = org.telegram.ui.Components.wc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, gVar).j();
                    }
                    j3.v = new ey0(9, profileActivity, zArr3);
                    return;
                }
                return;
            case 25:
                fb1 fb1Var = (fb1) obj;
                fb1Var.f32752i0.D(i12);
                fb1Var.m0(i12, true);
                return;
            case 26:
                xh.r0 r0Var = ((xh.s0) obj).f46009j0;
                int i19 = xh.r0.f45945s;
                r0Var.a(i12);
                return;
            default:
                ((xh.r0) obj).a(i12);
                return;
        }
    }

    public j5(MessageObject messageObject, int i10) {
        this.f2957a = 23;
        this.f2958b = i10;
        this.f2959c = messageObject;
    }
}
