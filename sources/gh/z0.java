package gh;

import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import kh.wb;
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
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.v20;
import org.telegram.ui.Components.wy;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ap0;
import org.telegram.ui.fh1;
import org.telegram.ui.gz0;
import org.telegram.ui.hz0;
import org.telegram.ui.ip0;
import org.telegram.ui.mg0;
import org.telegram.ui.mp0;
import org.telegram.ui.ng0;
import org.telegram.ui.qn;
import org.telegram.ui.s70;
import org.telegram.ui.s91;
import org.telegram.ui.sg1;
import org.telegram.ui.u70;
import org.telegram.ui.wl0;
import org.telegram.ui.wm0;
import org.telegram.ui.ys0;
import org.telegram.ui.zp0;
public final class z0 implements View.OnClickListener {
    public final int f9242a;
    public final int f9243b;
    public final Object f9244c;

    public z0(Object obj, int i9, int i10) {
        this.f9242a = i10;
        this.f9244c = obj;
        this.f9243b = i9;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        boolean z10;
        boolean z11;
        int i9;
        gc j10;
        int i10 = this.f9242a;
        int i11 = this.f9243b;
        Object obj = this.f9244c;
        switch (i10) {
            case 0:
                k1 k1Var = ((l1) obj).f8466f0;
                int i12 = k1.f8382s;
                k1Var.a(i11);
                return;
            case 1:
                ((k1) obj).a(i11);
                return;
            case 2:
                kh.na naVar = (kh.na) obj;
                if (naVar.f15691e.contains(Integer.valueOf(i11))) {
                    if (naVar.f15691e.size() > 1) {
                        naVar.f15691e.remove(Integer.valueOf(i11));
                    } else {
                        return;
                    }
                } else {
                    naVar.f15691e.add(Integer.valueOf(i11));
                }
                AndroidUtilities.forEachViews((RecyclerView) naVar.f15689b, (d5.d) new hg.i(naVar, 4));
                return;
            case 3:
                kh.k6 k6Var = ((kh.i6) obj).f15429b;
                if (k6Var.f15526r && (callback = k6Var.f15524f) != null) {
                    callback.run(Integer.valueOf(i11));
                    return;
                }
                return;
            case 4:
                ((qn) obj).G9(i11);
                return;
            case 5:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            g0Var.f28617b0 = !g0Var.f28617b0;
                        }
                    } else {
                        g0Var.f28616a0 = !g0Var.f28616a0;
                    }
                } else {
                    g0Var.Z = !g0Var.Z;
                }
                g0Var.T.N(true);
                g0Var.s();
                return;
            case 6:
                boolean[] zArr = (boolean[]) obj;
                boolean z12 = !zArr[i11];
                zArr[i11] = z12;
                ((org.telegram.ui.Cells.z1) view).c(z12, true);
                return;
            case 7:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f26241m1;
                chatAttachAlertPhotoLayout.f27493b.T0.getActionBarMenuOnItemClick().b(i11);
                chatAttachAlertPhotoLayout.f26281w.M(null, null);
                return;
            case 8:
                ((v20) obj).f33239b.x(i11, true);
                return;
            case 9:
                v20 v20Var = ((u20) obj).f32907c;
                v20Var.n(i11);
                v20Var.dismiss();
                return;
            case 10:
                kc0 kc0Var = (kc0) obj;
                if (kc0Var.f30056e.getAdapter() instanceof ic0) {
                    wy wyVar = ((px) ((ic0) kc0Var.f30056e.getAdapter())).f31768c;
                    if ((i11 == 1 || i11 == 2) && wyVar.f34443s1) {
                        if (i11 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        wyVar.Q(true, false, z10);
                        return;
                    } else if (i11 == 0 && wyVar.f34439r1) {
                        wyVar.Q(true, true, false);
                        return;
                    }
                }
                kc0Var.f30056e.x(i11, false);
                return;
            case 11:
                org.telegram.ui.Components.k4 k4Var = (org.telegram.ui.Components.k4) obj;
                EditTextBoldCursor editTextBoldCursor = k4Var.f28489c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                k4Var.d.run(Integer.valueOf(i11), editTextBoldCursor.getText().toString());
                k4Var.dismiss();
                return;
            case 12:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i11, scrollSlidingTextTabStrip.f26512a.indexOfChild(view));
                return;
            case 13:
                p51 p51Var = (p51) obj;
                int i13 = p51Var.f31550b.f26474i.f27111q;
                if (i13 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    p51Var.updateAppUpdateViews(i11, true);
                    return;
                } else if (i13 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    p51Var.updateAppUpdateViews(i11, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", p51Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 14:
                ((org.telegram.ui.Components.voip.u0) obj).f33864b.x(i11, true);
                return;
            case 15:
                fh1 fh1Var = (fh1) obj;
                if (fh1Var.Q == null && view.getAlpha() != 0.0f) {
                    fh1Var.c(i11, true);
                    return;
                }
                return;
            case 16:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i11);
                return;
            case 17:
                u70 u70Var = (u70) obj;
                u70Var.M.dismiss();
                int i14 = u70Var.V;
                if (i14 >= 0) {
                    u70Var.W.setKeepMedia(i14, i11);
                    s70 s70Var = u70Var.f43152a0;
                    if (s70Var != null) {
                        s70Var.a(i11);
                        return;
                    }
                    return;
                }
                s70 s70Var2 = u70Var.f43152a0;
                if (s70Var2 != null) {
                    s70Var2.a(i11);
                    return;
                }
                return;
            case 18:
                ng0 ng0Var = (ng0) obj;
                ValueAnimator valueAnimator = ng0Var.f42999c.M;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    sg1 sg1Var = ng0Var.f42999c;
                    if (!sg1Var.D) {
                        if (sg1Var.getCurrentPosition() == i11) {
                            org.telegram.ui.ActionBar.o2 W = ng0Var.W();
                            if (W instanceof mg0) {
                                ((mg0) W).s();
                                return;
                            }
                            return;
                        }
                        ng0Var.l0(i11, true);
                        ng0Var.f42999c.D(i11);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                wm0 wm0Var = (wm0) obj;
                wl0 wl0Var = wm0Var.f44208z1;
                wm0Var.O0 = i11;
                if (i11 == 1) {
                    wm0Var.f44160e0 = wm0Var.f44155c0;
                } else if (i11 == 4) {
                    wm0Var.f44160e0 = wm0Var.f44157d0;
                } else if (i11 == 2) {
                    wm0Var.f44160e0 = wm0Var.f44149a0;
                } else if (i11 == 3) {
                    wm0Var.f44160e0 = wm0Var.f44152b0;
                } else {
                    wm0Var.f44160e0 = wm0Var.Z;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, wm0Var, null);
                if (i11 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(wm0Var.f44164f1);
                    PhotoViewer.t1().b2(arrayList, 0, wl0Var);
                    return;
                } else if (i11 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(wm0Var.f44168h1);
                    PhotoViewer.t1().b2(arrayList2, 0, wl0Var);
                    return;
                } else if (i11 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(wm0Var.f44170i1);
                    PhotoViewer.t1().b2(arrayList3, 0, wl0Var);
                    return;
                } else if (i11 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = wm0Var.f44161e1;
                    t12.b2(arrayList4, arrayList4.indexOf(secureDocument), wl0Var);
                    return;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = wm0Var.f44166g1;
                    t13.b2(arrayList5, arrayList5.indexOf(secureDocument), wl0Var);
                    return;
                }
            case 20:
                ip0 ip0Var = (ip0) obj;
                org.telegram.ui.ActionBar.o1 o1Var = ip0Var.E;
                if (o1Var != null && o1Var.isShowing()) {
                    ip0Var.E.d(true);
                }
                if (i11 == 0) {
                    org.telegram.ui.Components.y4.L(ip0Var.getParentActivity(), ip0Var.B.a(), new ap0(ip0Var, 2));
                    return;
                }
                ip0Var.U(ip0Var.f39240b, ip0Var.f39241c, true, 0);
                ip0Var.finishFragment();
                return;
            case 21:
                zp0 zp0Var = (zp0) obj;
                org.telegram.ui.ActionBar.o1 o1Var2 = zp0Var.f45219i0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    zp0Var.f45219i0.d(true);
                }
                if (i11 == 0) {
                    org.telegram.ui.Components.y4.L(zp0Var.getParentActivity(), zp0Var.Q.a(), new mp0(zp0Var, 1));
                    return;
                } else {
                    zp0Var.d0(0, true);
                    return;
                }
            case 22:
                MessageObject messageObject = (MessageObject) obj;
                int i15 = PopupNotificationActivity.X;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i11).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i11 == 0) {
                    hz0 hz0Var = profileActivity.K;
                    if (!hz0Var.f28178y1) {
                        if (eu0.w0(hz0Var.getClosestTab())) {
                            hz0 hz0Var2 = profileActivity.K;
                            profileActivity.K.O0(profileActivity, profileActivity.a(), hz0Var2.h1(hz0Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            wb E = wb.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.f16321x = new gz0(profileActivity);
                            E.R(null);
                            return;
                        }
                    }
                }
                if (eu0.w0(profileActivity.K.getClosestTab())) {
                    long a2 = profileActivity.a();
                    hz0 hz0Var3 = profileActivity.K;
                    int h12 = hz0Var3.h1(hz0Var3.getClosestTab());
                    String w8 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.q8 q8Var = profileActivity.f36057t5;
                    if (q8Var != null) {
                        q8Var.run();
                        profileActivity.f36057t5 = null;
                    }
                    gc.e();
                    ArrayList arrayList6 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.K.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i16 = 0; i16 < actionModeSelected.size(); i16++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i16).storyItem;
                            if (storyItem != null) {
                                arrayList6.add(storyItem);
                            }
                        }
                    }
                    profileActivity.K.L(false);
                    if (!arrayList6.isEmpty()) {
                        c9 c9Var = new c9(profileActivity, a2, h12, arrayList6, 14);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList6);
                        oc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList6.size(), w8)), LocaleController.getString(R.string.UndoNoCaps), c9Var).j();
                        return;
                    }
                    return;
                }
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                org.telegram.messenger.q8 q8Var2 = profileActivity.f36057t5;
                if (q8Var2 != null) {
                    q8Var2.run();
                    profileActivity.f36057t5 = null;
                }
                gc.e();
                if (profileActivity.K.getClosestTab() == 9) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ArrayList arrayList7 = new ArrayList();
                SparseArray<MessageObject> actionModeSelected2 = profileActivity.K.getActionModeSelected();
                if (actionModeSelected2 != null) {
                    i9 = 0;
                    for (int i17 = 0; i17 < actionModeSelected2.size(); i17++) {
                        TL_stories.StoryItem storyItem2 = actionModeSelected2.valueAt(i17).storyItem;
                        if (storyItem2 != null) {
                            arrayList7.add(storyItem2);
                            i9++;
                        }
                    }
                } else {
                    i9 = 0;
                }
                profileActivity.K.L(false);
                if (z11) {
                    profileActivity.K.Y0(8);
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
                    profileActivity.f36057t5 = new org.telegram.messenger.q8(profileActivity, clientUserId, arrayList7, z14, 9);
                    fh.m1 m1Var = new fh.m1(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 15);
                    if (z14) {
                        j10 = oc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i9, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), m1Var).j();
                    } else {
                        j10 = oc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i9, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, m1Var).j();
                    }
                    j10.v = new ys0(18, profileActivity, zArr3);
                    return;
                }
                return;
            case 24:
                s91 s91Var = (s91) obj;
                s91Var.f42614e0.D(i11);
                s91Var.l0(i11, true);
                return;
            case 25:
                ((qh.x1) obj).L.Y3(i11);
                return;
            case 26:
                View.OnClickListener onClickListener = ((rg.e) obj).f47180b[i11];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                rg.a aVar = ((rg.g) obj).h;
                if (aVar != null) {
                    aVar.k(i11);
                    return;
                }
                return;
        }
    }

    public z0(MessageObject messageObject, int i9) {
        this.f9242a = 22;
        this.f9243b = i9;
        this.f9244c = messageObject;
    }
}
