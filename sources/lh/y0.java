package lh;

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
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.l30;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cm0;
import org.telegram.ui.dn0;
import org.telegram.ui.e80;
import org.telegram.ui.fq0;
import org.telegram.ui.g80;
import org.telegram.ui.ga1;
import org.telegram.ui.gh1;
import org.telegram.ui.hp0;
import org.telegram.ui.pp0;
import org.telegram.ui.rz0;
import org.telegram.ui.sz0;
import org.telegram.ui.th1;
import org.telegram.ui.tp0;
import org.telegram.ui.ug0;
import org.telegram.ui.vg0;
import org.telegram.ui.xn;
import org.telegram.ui.zq0;
public final class y0 implements View.OnClickListener {
    public final int f13373a;
    public final int f13374b;
    public final Object f13375c;

    public y0(Object obj, int i10, int i11) {
        this.f13373a = i11;
        this.f13375c = obj;
        this.f13374b = i10;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        boolean z10;
        int i10;
        ic j10;
        Utilities.Callback callback;
        int i11 = this.f13373a;
        int i12 = this.f13374b;
        Object obj = this.f13375c;
        switch (i11) {
            case 0:
                i1 i1Var = ((j1) obj).f12642g0;
                int i13 = i1.f12575s;
                i1Var.a(i12);
                return;
            case 1:
                ((i1) obj).a(i12);
                return;
            case 2:
                ((xn) obj).G9(i12);
                return;
            case 3:
                org.telegram.ui.Components.h0 h0Var = (org.telegram.ui.Components.h0) obj;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            h0Var.f25282c0 = !h0Var.f25282c0;
                        }
                    } else {
                        h0Var.f25281b0 = !h0Var.f25281b0;
                    }
                } else {
                    h0Var.f25280a0 = !h0Var.f25280a0;
                }
                h0Var.U.N(true);
                h0Var.s();
                return;
            case 4:
                boolean[] zArr = (boolean[]) obj;
                boolean z11 = !zArr[i12];
                zArr[i12] = z11;
                ((org.telegram.ui.Cells.z1) view).c(z11, true);
                return;
            case 5:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f22894n1;
                chatAttachAlertPhotoLayout.f24278b.U0.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.f22935w.M(null, null);
                return;
            case 6:
                ((m30) obj).f26930b.x(i12, true);
                return;
            case 7:
                m30 m30Var = ((l30) obj).f26542c;
                m30Var.n(i12);
                m30Var.dismiss();
                return;
            case 8:
                fd0 fd0Var = (fd0) obj;
                if (fd0Var.e.getAdapter() instanceof dd0) {
                    kz kzVar = ((cy) ((dd0) fd0Var.e.getAdapter())).f24076c;
                    if ((i12 == 1 || i12 == 2) && kzVar.f26471t1) {
                        if (i12 == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        kzVar.R(true, false, z4);
                        return;
                    } else if (i12 == 0 && kzVar.f26468s1) {
                        kzVar.R(true, true, false);
                        return;
                    }
                }
                fd0Var.e.x(i12, false);
                return;
            case 9:
                org.telegram.ui.Components.l4 l4Var = (org.telegram.ui.Components.l4) obj;
                EditTextBoldCursor editTextBoldCursor = l4Var.f24024c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                l4Var.d.run(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                l4Var.dismiss();
                return;
            case 10:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i12, scrollSlidingTextTabStrip.f23153a.indexOfChild(view));
                return;
            case 11:
                n61 n61Var = (n61) obj;
                int i14 = n61Var.f27206b.f23117i.f29162q;
                if (i14 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    n61Var.updateAppUpdateViews(i12, true);
                    return;
                } else if (i14 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    n61Var.updateAppUpdateViews(i12, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", n61Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 12:
                ((org.telegram.ui.Components.voip.u0) obj).f29966b.x(i12, true);
                return;
            case 13:
                th1 th1Var = (th1) obj;
                if (th1Var.R == null && view.getAlpha() != 0.0f) {
                    th1Var.c(i12, true);
                    return;
                }
                return;
            case 14:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i12);
                return;
            case 15:
                g80 g80Var = (g80) obj;
                g80Var.N.dismiss();
                int i15 = g80Var.W;
                if (i15 >= 0) {
                    g80Var.f34479a0.setKeepMedia(i15, i12);
                    e80 e80Var = g80Var.f34480b0;
                    if (e80Var != null) {
                        e80Var.a(i12);
                        return;
                    }
                    return;
                }
                e80 e80Var2 = g80Var.f34480b0;
                if (e80Var2 != null) {
                    e80Var2.a(i12);
                    return;
                }
                return;
            case 16:
                vg0 vg0Var = (vg0) obj;
                ValueAnimator valueAnimator = vg0Var.f34875c.N;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    gh1 gh1Var = vg0Var.f34875c;
                    if (!gh1Var.E) {
                        if (gh1Var.getCurrentPosition() == i12) {
                            org.telegram.ui.ActionBar.p2 X = vg0Var.X();
                            if (X instanceof ug0) {
                                ((ug0) X).s();
                                return;
                            }
                            return;
                        }
                        vg0Var.m0(i12, true);
                        vg0Var.f34875c.D(i12);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                dn0 dn0Var = (dn0) obj;
                cm0 cm0Var = dn0Var.A1;
                dn0Var.P0 = i12;
                if (i12 == 1) {
                    dn0Var.f33696f0 = dn0Var.f33691d0;
                } else if (i12 == 4) {
                    dn0Var.f33696f0 = dn0Var.f33693e0;
                } else if (i12 == 2) {
                    dn0Var.f33696f0 = dn0Var.f33686b0;
                } else if (i12 == 3) {
                    dn0Var.f33696f0 = dn0Var.f33689c0;
                } else {
                    dn0Var.f33696f0 = dn0Var.f33683a0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, dn0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(dn0Var.f33699g1);
                    PhotoViewer.t1().b2(arrayList, 0, cm0Var);
                    return;
                } else if (i12 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(dn0Var.f33703i1);
                    PhotoViewer.t1().b2(arrayList2, 0, cm0Var);
                    return;
                } else if (i12 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(dn0Var.f33705j1);
                    PhotoViewer.t1().b2(arrayList3, 0, cm0Var);
                    return;
                } else if (i12 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = dn0Var.f33697f1;
                    t12.b2(arrayList4, arrayList4.indexOf(secureDocument), cm0Var);
                    return;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = dn0Var.f33701h1;
                    t13.b2(arrayList5, arrayList5.indexOf(secureDocument), cm0Var);
                    return;
                }
            case 18:
                pp0 pp0Var = (pp0) obj;
                org.telegram.ui.ActionBar.p1 p1Var = pp0Var.F;
                if (p1Var != null && p1Var.isShowing()) {
                    pp0Var.F.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.z4.L(pp0Var.getParentActivity(), pp0Var.C.a(), new hp0(pp0Var, 2));
                    return;
                }
                pp0Var.V(pp0Var.f37428b, pp0Var.f37429c, true, 0);
                pp0Var.finishFragment();
                return;
            case 19:
                fq0 fq0Var = (fq0) obj;
                org.telegram.ui.ActionBar.p1 p1Var2 = fq0Var.f34326j0;
                if (p1Var2 != null && p1Var2.isShowing()) {
                    fq0Var.f34326j0.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.z4.L(fq0Var.getParentActivity(), fq0Var.R.a(), new tp0(fq0Var, 1));
                    return;
                } else {
                    fq0Var.e0(0, true);
                    return;
                }
            case 20:
                MessageObject messageObject = (MessageObject) obj;
                int i16 = PopupNotificationActivity.Y;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i12).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 21:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i12 == 0) {
                    sz0 sz0Var = profileActivity.L;
                    if (!sz0Var.f31161z1) {
                        if (yu0.w0(sz0Var.getClosestTab())) {
                            sz0 sz0Var2 = profileActivity.L;
                            profileActivity.L.O0(profileActivity, profileActivity.a(), sz0Var2.h1(sz0Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            ph.da E = ph.da.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.f41546x = new rz0(profileActivity);
                            E.R(null);
                            return;
                        }
                    }
                }
                if (yu0.w0(profileActivity.L.getClosestTab())) {
                    long a2 = profileActivity.a();
                    sz0 sz0Var3 = profileActivity.L;
                    int h12 = sz0Var3.h1(sz0Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.w8 w8Var = profileActivity.f32173u5;
                    if (w8Var != null) {
                        w8Var.run();
                        profileActivity.f32173u5 = null;
                    }
                    ic.e();
                    ArrayList arrayList6 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.L.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i17 = 0; i17 < actionModeSelected.size(); i17++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i17).storyItem;
                            if (storyItem != null) {
                                arrayList6.add(storyItem);
                            }
                        }
                    }
                    profileActivity.L.L(false);
                    if (!arrayList6.isEmpty()) {
                        y8 y8Var = new y8(profileActivity, a2, h12, arrayList6, 14);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList6);
                        qc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList6.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), y8Var).j();
                        return;
                    }
                    return;
                }
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                org.telegram.messenger.w8 w8Var2 = profileActivity.f32173u5;
                if (w8Var2 != null) {
                    w8Var2.run();
                    profileActivity.f32173u5 = null;
                }
                ic.e();
                if (profileActivity.L.getClosestTab() == 9) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList7 = new ArrayList();
                SparseArray<MessageObject> actionModeSelected2 = profileActivity.L.getActionModeSelected();
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
                profileActivity.L.L(false);
                if (z10) {
                    profileActivity.L.Y0(8);
                }
                if (!arrayList7.isEmpty()) {
                    boolean[] zArr2 = new boolean[arrayList7.size()];
                    for (int i19 = 0; i19 < arrayList7.size(); i19++) {
                        TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) arrayList7.get(i19);
                        zArr2[i19] = storyItem3.pinned;
                        storyItem3.pinned = z10;
                    }
                    profileActivity.getMessagesController().getStoriesController().n0(clientUserId, arrayList7, false);
                    boolean[] zArr3 = {false};
                    boolean z13 = z10;
                    profileActivity.f32173u5 = new org.telegram.messenger.w8(profileActivity, clientUserId, arrayList7, z13, 9);
                    kh.g1 g1Var = new kh.g1(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 15);
                    if (z13) {
                        j10 = qc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), g1Var).j();
                    } else {
                        j10 = qc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, g1Var).j();
                    }
                    j10.v = new zq0(24, profileActivity, zArr3);
                    return;
                }
                return;
            case 22:
                ga1 ga1Var = (ga1) obj;
                ga1Var.f34536f0.D(i12);
                ga1Var.m0(i12, true);
                return;
            case 23:
                ph.w8 w8Var3 = (ph.w8) obj;
                if (w8Var3.e.contains(Integer.valueOf(i12))) {
                    if (w8Var3.e.size() > 1) {
                        w8Var3.e.remove(Integer.valueOf(i12));
                    } else {
                        return;
                    }
                } else {
                    w8Var3.e.add(Integer.valueOf(i12));
                }
                AndroidUtilities.forEachViews((RecyclerView) w8Var3.f42240b, (h5.d) new mg.i(w8Var3, 4));
                return;
            case 24:
                ph.f5 f5Var = ((ph.d5) obj).f41443b;
                if (f5Var.f41648r && (callback = f5Var.f41646f) != null) {
                    callback.run(Integer.valueOf(i12));
                    return;
                }
                return;
            case 25:
                ((vh.y1) obj).M.Y3(i12);
                return;
            case 26:
                View.OnClickListener onClickListener = ((wg.e) obj).f46555b[i12];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            default:
                wg.a aVar = ((wg.g) obj).h;
                if (aVar != null) {
                    aVar.k(i12);
                    return;
                }
                return;
        }
    }

    public y0(MessageObject messageObject, int i10) {
        this.f13373a = 20;
        this.f13374b = i10;
        this.f13375c = messageObject;
    }
}
