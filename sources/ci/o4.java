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
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.l30;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ai1;
import org.telegram.ui.ar0;
import org.telegram.ui.bo;
import org.telegram.ui.bq0;
import org.telegram.ui.dh0;
import org.telegram.ui.eh0;
import org.telegram.ui.iy0;
import org.telegram.ui.jq0;
import org.telegram.ui.l01;
import org.telegram.ui.m01;
import org.telegram.ui.n80;
import org.telegram.ui.ni1;
import org.telegram.ui.nm0;
import org.telegram.ui.nq0;
import org.telegram.ui.on0;
import org.telegram.ui.p80;
import org.telegram.ui.za1;
public final class o4 implements View.OnClickListener {
    public final int f5123a;
    public final int f5124b;
    public final Object f5125c;

    public o4(Object obj, int i10, int i11) {
        this.f5123a = i11;
        this.f5125c = obj;
        this.f5124b = i10;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        boolean z10;
        boolean z11;
        int i10;
        org.telegram.ui.Components.oc j3;
        int i11 = this.f5123a;
        int i12 = this.f5124b;
        Object obj = this.f5125c;
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
                AndroidUtilities.forEachViews((RecyclerView) fbVar.f5608b, (e2.h) new ai.f3(fbVar, 3));
                return;
            case 1:
                v6 v6Var = ((t6) obj).f5567b;
                if (v6Var.f5658r && (callback = v6Var.f5656f) != null) {
                    callback.run(Integer.valueOf(i12));
                    return;
                }
                return;
            case 2:
                ((ii.d2) obj).P.Y3(i12);
                return;
            case 3:
                View.OnClickListener onClickListener = ((jh.e) obj).f13018b[i12];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 4:
                jh.a aVar = ((jh.h) obj).h;
                if (aVar != null) {
                    aVar.k(i12);
                    return;
                }
                return;
            case 5:
                ((bo) obj).G9(i12);
                return;
            case 6:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            g0Var.f24137f0 = !g0Var.f24137f0;
                        }
                    } else {
                        g0Var.f24136e0 = !g0Var.f24136e0;
                    }
                } else {
                    g0Var.f24135d0 = !g0Var.f24135d0;
                }
                g0Var.X.N(true);
                g0Var.s();
                return;
            case 7:
                boolean[] zArr = (boolean[]) obj;
                boolean z12 = !zArr[i12];
                zArr[i12] = z12;
                ((org.telegram.ui.Cells.z1) view).c(z12, true);
                return;
            case 8:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f21895q1;
                chatAttachAlertPhotoLayout.f26461b.X0.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.f21939w.M(null, null);
                return;
            case 9:
                ((l30) obj).f25819b.x(i12, true);
                return;
            case 10:
                l30 l30Var = ((k30) obj).f25531c;
                l30Var.n(i12);
                l30Var.dismiss();
                return;
            case 11:
                dd0 dd0Var = (dd0) obj;
                if (dd0Var.e.getAdapter() instanceof bd0) {
                    kz kzVar = ((dy) ((bd0) dd0Var.e.getAdapter())).f23414c;
                    if ((i12 == 1 || i12 == 2) && kzVar.f25763w1) {
                        if (i12 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        kzVar.P(true, false, z10);
                        return;
                    } else if (i12 == 0 && kzVar.f25759v1) {
                        kzVar.P(true, true, false);
                        return;
                    }
                }
                dd0Var.e.x(i12, false);
                return;
            case 12:
                org.telegram.ui.Components.o4 o4Var = (org.telegram.ui.Components.o4) obj;
                EditTextBoldCursor editTextBoldCursor = o4Var.f28425c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                o4Var.d.run(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                o4Var.dismiss();
                return;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i12, scrollSlidingTextTabStrip.f22163a.indexOfChild(view));
                return;
            case 14:
                l61 l61Var = (l61) obj;
                int i13 = l61Var.f25845b.f22127i.f27811q;
                if (i13 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    l61Var.updateAppUpdateViews(i12, true);
                    return;
                } else if (i13 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    l61Var.updateAppUpdateViews(i12, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", l61Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 15:
                ((org.telegram.ui.Components.voip.x0) obj).f29338b.x(i12, true);
                return;
            case 16:
                ni1 ni1Var = (ni1) obj;
                if (ni1Var.U == null && view.getAlpha() != 0.0f) {
                    ni1Var.c(i12, true);
                    return;
                }
                return;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i12);
                return;
            case 18:
                p80 p80Var = (p80) obj;
                p80Var.Q.dismiss();
                int i14 = p80Var.f36465c0;
                if (i14 >= 0) {
                    p80Var.f36466d0.setKeepMedia(i14, i12);
                    n80 n80Var = p80Var.f36467e0;
                    if (n80Var != null) {
                        n80Var.a(i12);
                        return;
                    }
                    return;
                }
                n80 n80Var2 = p80Var.f36467e0;
                if (n80Var2 != null) {
                    n80Var2.a(i12);
                    return;
                }
                return;
            case 19:
                eh0 eh0Var = (eh0) obj;
                ValueAnimator valueAnimator = eh0Var.f32167c.Q;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    ai1 ai1Var = eh0Var.f32167c;
                    if (!ai1Var.H) {
                        if (ai1Var.getCurrentPosition() == i12) {
                            org.telegram.ui.ActionBar.n2 X = eh0Var.X();
                            if (X instanceof dh0) {
                                ((dh0) X).r();
                                return;
                            }
                            return;
                        }
                        eh0Var.m0(i12, true);
                        eh0Var.f32167c.D(i12);
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
                    on0Var.f36276i0 = on0Var.f36272g0;
                } else if (i12 == 4) {
                    on0Var.f36276i0 = on0Var.f36274h0;
                } else if (i12 == 2) {
                    on0Var.f36276i0 = on0Var.f36267e0;
                } else if (i12 == 3) {
                    on0Var.f36276i0 = on0Var.f36270f0;
                } else {
                    on0Var.f36276i0 = on0Var.f36265d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().J2(null, on0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(on0Var.f36279j1);
                    PhotoViewer.t1().b2(arrayList, 0, nm0Var);
                    return;
                } else if (i12 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(on0Var.l1);
                    PhotoViewer.t1().b2(arrayList2, 0, nm0Var);
                    return;
                } else if (i12 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(on0Var.f36283m1);
                    PhotoViewer.t1().b2(arrayList3, 0, nm0Var);
                    return;
                } else if (i12 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = on0Var.f36277i1;
                    t12.b2(arrayList4, arrayList4.indexOf(secureDocument), nm0Var);
                    return;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = on0Var.f36281k1;
                    t13.b2(arrayList5, arrayList5.indexOf(secureDocument), nm0Var);
                    return;
                }
            case 21:
                jq0 jq0Var = (jq0) obj;
                org.telegram.ui.ActionBar.n1 n1Var = jq0Var.I;
                if (n1Var != null && n1Var.isShowing()) {
                    jq0Var.I.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.c5.L(jq0Var.getParentActivity(), jq0Var.F.a(), new bq0(jq0Var, 2));
                    return;
                }
                jq0Var.V(jq0Var.f34965b, jq0Var.f34966c, true, 0);
                jq0Var.finishFragment();
                return;
            case 22:
                ar0 ar0Var = (ar0) obj;
                org.telegram.ui.ActionBar.n1 n1Var2 = ar0Var.m0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    ar0Var.m0.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.c5.L(ar0Var.getParentActivity(), ar0Var.U.a(), new nq0(ar0Var, 1));
                    return;
                } else {
                    ar0Var.e0(0, true);
                    return;
                }
            case 23:
                MessageObject messageObject = (MessageObject) obj;
                int i15 = PopupNotificationActivity.f31140b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i12).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i12 == 0) {
                    m01 m01Var = profileActivity.O;
                    if (!m01Var.C1) {
                        if (yu0.w0(m01Var.getClosestTab())) {
                            m01 m01Var2 = profileActivity.O;
                            profileActivity.O.O0(profileActivity, profileActivity.a(), m01Var2.h1(m01Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            oc E = oc.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.f5275x = new l01(profileActivity);
                            E.R(null);
                            return;
                        }
                    }
                }
                if (yu0.w0(profileActivity.O.getClosestTab())) {
                    long a2 = profileActivity.a();
                    m01 m01Var3 = profileActivity.O;
                    int h12 = m01Var3.h1(m01Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.t8 t8Var = profileActivity.f31402x5;
                    if (t8Var != null) {
                        t8Var.run();
                        profileActivity.f31402x5 = null;
                    }
                    org.telegram.ui.Components.oc.e();
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
                        org.telegram.ui.Components.vc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList6.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), j7Var).j();
                        return;
                    }
                    return;
                }
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                org.telegram.messenger.t8 t8Var2 = profileActivity.f31402x5;
                if (t8Var2 != null) {
                    t8Var2.run();
                    profileActivity.f31402x5 = null;
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
                    profileActivity.f31402x5 = new org.telegram.messenger.t8(profileActivity, clientUserId, arrayList7, z11, 9);
                    org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 7);
                    if (z14) {
                        j3 = org.telegram.ui.Components.vc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), fVar).j();
                    } else {
                        j3 = org.telegram.ui.Components.vc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, fVar).j();
                    }
                    j3.v = new iy0(6, profileActivity, zArr3);
                    return;
                }
                return;
            case 25:
                za1 za1Var = (za1) obj;
                za1Var.f40120i0.D(i12);
                za1Var.m0(i12, true);
                return;
            case 26:
                yh.r0 r0Var = ((yh.s0) obj).f47703j0;
                int i19 = yh.r0.f47644s;
                r0Var.a(i12);
                return;
            default:
                ((yh.r0) obj).a(i12);
                return;
        }
    }

    public o4(MessageObject messageObject, int i10) {
        this.f5123a = 23;
        this.f5124b = i10;
        this.f5125c = messageObject;
    }
}
