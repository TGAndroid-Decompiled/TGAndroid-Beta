package di;

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
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.l30;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ai1;
import org.telegram.ui.bb1;
import org.telegram.ui.br0;
import org.telegram.ui.co;
import org.telegram.ui.cq0;
import org.telegram.ui.dh0;
import org.telegram.ui.eh0;
import org.telegram.ui.kq0;
import org.telegram.ui.l01;
import org.telegram.ui.m01;
import org.telegram.ui.n80;
import org.telegram.ui.ni1;
import org.telegram.ui.om0;
import org.telegram.ui.oq0;
import org.telegram.ui.p80;
import org.telegram.ui.pn0;
import org.telegram.ui.rx0;
public final class o4 implements View.OnClickListener {
    public final int f7757a;
    public final int f7758b;
    public final Object f7759c;

    public o4(Object obj, int i10, int i11) {
        this.f7757a = i11;
        this.f7759c = obj;
        this.f7758b = i10;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        boolean z10;
        boolean z11;
        int i10;
        org.telegram.ui.Components.qc j3;
        int i11 = this.f7757a;
        int i12 = this.f7758b;
        Object obj = this.f7759c;
        switch (i11) {
            case 0:
                fb fbVar = (fb) obj;
                if (fbVar.f8264e.contains(Integer.valueOf(i12))) {
                    if (fbVar.f8264e.size() > 1) {
                        fbVar.f8264e.remove(Integer.valueOf(i12));
                    } else {
                        return;
                    }
                } else {
                    fbVar.f8264e.add(Integer.valueOf(i12));
                }
                AndroidUtilities.forEachViews((RecyclerView) fbVar.f8262b, (e2.h) new ah.m(fbVar, 4));
                return;
            case 1:
                u6 u6Var = ((s6) obj).f8152b;
                if (u6Var.f8281r && (callback = u6Var.f8279f) != null) {
                    callback.run(Integer.valueOf(i12));
                    return;
                }
                return;
            case 2:
                ((ji.c2) obj).P.X3(i12);
                return;
            case 3:
                View.OnClickListener onClickListener = ((kh.e) obj).f14971b[i12];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 4:
                kh.a aVar = ((kh.h) obj).h;
                if (aVar != null) {
                    aVar.k(i12);
                    return;
                }
                return;
            case 5:
                ((co) obj).G9(i12);
                return;
            case 6:
                org.telegram.ui.Components.h0 h0Var = (org.telegram.ui.Components.h0) obj;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            h0Var.f26576f0 = !h0Var.f26576f0;
                        }
                    } else {
                        h0Var.f26575e0 = !h0Var.f26575e0;
                    }
                } else {
                    h0Var.f26574d0 = !h0Var.f26574d0;
                }
                h0Var.X.N(true);
                h0Var.s();
                return;
            case 7:
                boolean[] zArr = (boolean[]) obj;
                boolean z12 = !zArr[i12];
                zArr[i12] = z12;
                ((org.telegram.ui.Cells.z1) view).c(z12, true);
                return;
            case 8:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f23858q1;
                chatAttachAlertPhotoLayout.f28780b.X0.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.f23902w.M(null, null);
                return;
            case 9:
                ((l30) obj).f28063b.x(i12, true);
                return;
            case 10:
                l30 l30Var = ((k30) obj).f27708c;
                l30Var.n(i12);
                l30Var.dismiss();
                return;
            case 11:
                ed0 ed0Var = (ed0) obj;
                if (ed0Var.f25684e.getAdapter() instanceof cd0) {
                    kz kzVar = ((ey) ((cd0) ed0Var.f25684e.getAdapter())).f25831c;
                    if ((i12 == 1 || i12 == 2) && kzVar.f28023w1) {
                        if (i12 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        kzVar.R(true, false, z10);
                        return;
                    } else if (i12 == 0 && kzVar.f28019v1) {
                        kzVar.R(true, true, false);
                        return;
                    }
                }
                ed0Var.f25684e.x(i12, false);
                return;
            case 12:
                org.telegram.ui.Components.q4 q4Var = (org.telegram.ui.Components.q4) obj;
                EditTextBoldCursor editTextBoldCursor = q4Var.f30948c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                q4Var.d.run(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                q4Var.dismiss();
                return;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i12, scrollSlidingTextTabStrip.f24141a.indexOfChild(view));
                return;
            case 14:
                l61 l61Var = (l61) obj;
                int i13 = l61Var.f28096b.f24103i.f30600q;
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
                ((org.telegram.ui.Components.voip.v0) obj).f31909b.x(i12, true);
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
                int i14 = p80Var.f39454c0;
                if (i14 >= 0) {
                    p80Var.f39455d0.setKeepMedia(i14, i12);
                    n80 n80Var = p80Var.f39456e0;
                    if (n80Var != null) {
                        n80Var.a(i12);
                        return;
                    }
                    return;
                }
                n80 n80Var2 = p80Var.f39456e0;
                if (n80Var2 != null) {
                    n80Var2.a(i12);
                    return;
                }
                return;
            case 19:
                eh0 eh0Var = (eh0) obj;
                ValueAnimator valueAnimator = eh0Var.f34843c.Q;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    ai1 ai1Var = eh0Var.f34843c;
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
                        eh0Var.f34843c.D(i12);
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
                    pn0Var.f39596i0 = pn0Var.f39592g0;
                } else if (i12 == 4) {
                    pn0Var.f39596i0 = pn0Var.f39594h0;
                } else if (i12 == 2) {
                    pn0Var.f39596i0 = pn0Var.f39587e0;
                } else if (i12 == 3) {
                    pn0Var.f39596i0 = pn0Var.f39590f0;
                } else {
                    pn0Var.f39596i0 = pn0Var.f39584d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, pn0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(pn0Var.f39599j1);
                    PhotoViewer.t1().b2(arrayList, 0, om0Var);
                    return;
                } else if (i12 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(pn0Var.l1);
                    PhotoViewer.t1().b2(arrayList2, 0, om0Var);
                    return;
                } else if (i12 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(pn0Var.f39603m1);
                    PhotoViewer.t1().b2(arrayList3, 0, om0Var);
                    return;
                } else if (i12 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = pn0Var.f39597i1;
                    t12.b2(arrayList4, arrayList4.indexOf(secureDocument), om0Var);
                    return;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = pn0Var.f39601k1;
                    t13.b2(arrayList5, arrayList5.indexOf(secureDocument), om0Var);
                    return;
                }
            case 21:
                kq0 kq0Var = (kq0) obj;
                org.telegram.ui.ActionBar.n1 n1Var = kq0Var.I;
                if (n1Var != null && n1Var.isShowing()) {
                    kq0Var.I.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.e5.L(kq0Var.getParentActivity(), kq0Var.F.a(), new cq0(kq0Var, 2));
                    return;
                }
                kq0Var.V(kq0Var.f38132b, kq0Var.f38133c, true, 0);
                kq0Var.finishFragment();
                return;
            case 22:
                br0 br0Var = (br0) obj;
                org.telegram.ui.ActionBar.n1 n1Var2 = br0Var.m0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    br0Var.m0.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.e5.L(br0Var.getParentActivity(), br0Var.U.a(), new oq0(br0Var, 1));
                    return;
                } else {
                    br0Var.e0(0, true);
                    return;
                }
            case 23:
                MessageObject messageObject = (MessageObject) obj;
                int i15 = PopupNotificationActivity.f33784b0;
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
                        if (xu0.w0(m01Var.getClosestTab())) {
                            m01 m01Var2 = profileActivity.O;
                            profileActivity.O.O0(profileActivity, profileActivity.a(), m01Var2.h1(m01Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            pc E = pc.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.f7944x = new l01(profileActivity);
                            E.R(null);
                            return;
                        }
                    }
                }
                if (xu0.w0(profileActivity.O.getClosestTab())) {
                    long a2 = profileActivity.a();
                    m01 m01Var3 = profileActivity.O;
                    int h12 = m01Var3.h1(m01Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.t8 t8Var = profileActivity.f34051x5;
                    if (t8Var != null) {
                        t8Var.run();
                        profileActivity.f34051x5 = null;
                    }
                    org.telegram.ui.Components.qc.e();
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
                        org.telegram.ui.Components.yc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList6.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), j7Var).j();
                        return;
                    }
                    return;
                }
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                org.telegram.messenger.t8 t8Var2 = profileActivity.f34051x5;
                if (t8Var2 != null) {
                    t8Var2.run();
                    profileActivity.f34051x5 = null;
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
                    profileActivity.f34051x5 = new org.telegram.messenger.t8(profileActivity, clientUserId, arrayList7, z14, 9);
                    org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 7);
                    if (z14) {
                        j3 = org.telegram.ui.Components.yc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), fVar).j();
                    } else {
                        j3 = org.telegram.ui.Components.yc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, fVar).j();
                    }
                    j3.v = new rx0(12, profileActivity, zArr3);
                    return;
                }
                return;
            case 25:
                bb1 bb1Var = (bb1) obj;
                bb1Var.f34730i0.D(i12);
                bb1Var.m0(i12, true);
                return;
            case 26:
                zh.r0 r0Var = ((zh.s0) obj).f52570j0;
                int i19 = zh.r0.f52529s;
                r0Var.a(i12);
                return;
            default:
                ((zh.r0) obj).a(i12);
                return;
        }
    }

    public o4(MessageObject messageObject, int i10) {
        this.f7757a = 23;
        this.f7758b = i10;
        this.f7759c = messageObject;
    }
}
