package di;

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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.x30;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fo;
import org.telegram.ui.fq0;
import org.telegram.ui.fr0;
import org.telegram.ui.hb1;
import org.telegram.ui.ih0;
import org.telegram.ui.ii1;
import org.telegram.ui.jh0;
import org.telegram.ui.m50;
import org.telegram.ui.oq0;
import org.telegram.ui.p01;
import org.telegram.ui.q01;
import org.telegram.ui.r80;
import org.telegram.ui.rm0;
import org.telegram.ui.rr0;
import org.telegram.ui.sn0;
import org.telegram.ui.sq0;
import org.telegram.ui.t80;
import org.telegram.ui.vi1;
public final class m4 implements View.OnClickListener {
    public final int f7423a;
    public final int f7424b;
    public final Object f7425c;

    public m4(Object obj, int i10, int i11) {
        this.f7423a = i11;
        this.f7425c = obj;
        this.f7424b = i10;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        boolean z10;
        boolean z11;
        int i10;
        org.telegram.ui.Components.sc j10;
        int i11 = this.f7423a;
        int i12 = this.f7424b;
        Object obj = this.f7425c;
        switch (i11) {
            case 0:
                bb bbVar = (bb) obj;
                if (bbVar.e.contains(Integer.valueOf(i12))) {
                    if (bbVar.e.size() > 1) {
                        bbVar.e.remove(Integer.valueOf(i12));
                    } else {
                        return;
                    }
                } else {
                    bbVar.e.add(Integer.valueOf(i12));
                }
                AndroidUtilities.forEachViews((RecyclerView) bbVar.f7756b, (Utilities.Callback<View>) new bi.o1(bbVar, 10));
                return;
            case 1:
                s6 s6Var = ((q6) obj).f7651b;
                if (s6Var.f7773r && (callback = s6Var.f7771f) != null) {
                    callback.run(Integer.valueOf(i12));
                    return;
                }
                return;
            case 2:
                ((ji.d2) obj).P.Z3(i12);
                return;
            case 3:
                View.OnClickListener onClickListener = ((kh.e) obj).f14269b[i12];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 4:
                kh.a aVar = ((kh.h) obj).h;
                if (aVar != null) {
                    aVar.j(i12);
                    return;
                }
                return;
            case 5:
                ((fo) obj).L9(i12);
                return;
            case 6:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            g0Var.f24854f0 = !g0Var.f24854f0;
                        }
                    } else {
                        g0Var.f24853e0 = !g0Var.f24853e0;
                    }
                } else {
                    g0Var.f24852d0 = !g0Var.f24852d0;
                }
                g0Var.X.N(true);
                g0Var.u();
                return;
            case 7:
                boolean[] zArr = (boolean[]) obj;
                boolean z12 = !zArr[i12];
                zArr[i12] = z12;
                ((org.telegram.ui.Cells.a2) view).c(z12, true);
                return;
            case 8:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f22718q1;
                chatAttachAlertPhotoLayout.f27360b.f29656a1.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.f22762w.M(null, null);
                return;
            case 9:
                ((m50) obj).f31128b.x(i12, true);
                return;
            case 10:
                m50 m50Var = ((x30) obj).f30851c;
                m50Var.o(i12);
                m50Var.dismiss();
                return;
            case 11:
                de0 de0Var = (de0) obj;
                if (de0Var.e.getAdapter() instanceof be0) {
                    wz wzVar = ((py) ((be0) de0Var.e.getAdapter())).f28132c;
                    if ((i12 == 1 || i12 == 2) && wzVar.f30770w1) {
                        if (i12 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        wzVar.P(true, false, z10);
                        return;
                    } else if (i12 == 0 && wzVar.f30766v1) {
                        wzVar.P(true, true, false);
                        return;
                    }
                }
                de0Var.e.x(i12, false);
                return;
            case 12:
                org.telegram.ui.Components.s4 s4Var = (org.telegram.ui.Components.s4) obj;
                EditTextBoldCursor editTextBoldCursor = s4Var.f29758c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                s4Var.d.run(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                s4Var.dismiss();
                return;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i12, scrollSlidingTextTabStrip.f22986a.indexOfChild(view));
                return;
            case 14:
                o71 o71Var = (o71) obj;
                int i13 = o71Var.f27594b.f22950i.f29023q;
                if (i13 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    o71Var.updateAppUpdateViews(i12, true);
                    return;
                } else if (i13 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    o71Var.updateAppUpdateViews(i12, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", o71Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 15:
                ((org.telegram.ui.Components.voip.v0) obj).f30214b.x(i12, true);
                return;
            case 16:
                vi1 vi1Var = (vi1) obj;
                if (vi1Var.U == null && view.getAlpha() != 0.0f) {
                    vi1Var.c(i12, true);
                    return;
                }
                return;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i12);
                return;
            case 18:
                t80 t80Var = (t80) obj;
                t80Var.Q.dismiss();
                int i14 = t80Var.f40023c0;
                if (i14 >= 0) {
                    t80Var.f40024d0.setKeepMedia(i14, i12);
                    r80 r80Var = t80Var.f40025e0;
                    if (r80Var != null) {
                        r80Var.a(i12);
                        return;
                    }
                    return;
                }
                r80 r80Var2 = t80Var.f40025e0;
                if (r80Var2 != null) {
                    r80Var2.a(i12);
                    return;
                }
                return;
            case 19:
                jh0 jh0Var = (jh0) obj;
                ValueAnimator valueAnimator = jh0Var.f37072c.Q;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    ii1 ii1Var = jh0Var.f37072c;
                    if (!ii1Var.H) {
                        if (ii1Var.getCurrentPosition() == i12) {
                            org.telegram.ui.ActionBar.m2 X = jh0Var.X();
                            if (X instanceof ih0) {
                                ((ih0) X).t();
                                return;
                            }
                            return;
                        }
                        jh0Var.m0(i12, true);
                        jh0Var.f37072c.D(i12);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                sn0 sn0Var = (sn0) obj;
                rm0 rm0Var = sn0Var.D1;
                sn0Var.S0 = i12;
                if (i12 == 1) {
                    sn0Var.f39874i0 = sn0Var.f39870g0;
                } else if (i12 == 4) {
                    sn0Var.f39874i0 = sn0Var.f39872h0;
                } else if (i12 == 2) {
                    sn0Var.f39874i0 = sn0Var.f39865e0;
                } else if (i12 == 3) {
                    sn0Var.f39874i0 = sn0Var.f39868f0;
                } else {
                    sn0Var.f39874i0 = sn0Var.f39863d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, sn0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(sn0Var.f39877j1);
                    PhotoViewer.t1().c2(arrayList, 0, rm0Var);
                    return;
                } else if (i12 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(sn0Var.l1);
                    PhotoViewer.t1().c2(arrayList2, 0, rm0Var);
                    return;
                } else if (i12 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(sn0Var.f39881m1);
                    PhotoViewer.t1().c2(arrayList3, 0, rm0Var);
                    return;
                } else if (i12 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = sn0Var.f39875i1;
                    t12.c2(arrayList4, arrayList4.indexOf(secureDocument), rm0Var);
                    return;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = sn0Var.f39879k1;
                    t13.c2(arrayList5, arrayList5.indexOf(secureDocument), rm0Var);
                    return;
                }
            case 21:
                oq0 oq0Var = (oq0) obj;
                org.telegram.ui.ActionBar.m1 m1Var = oq0Var.I;
                if (m1Var != null && m1Var.isShowing()) {
                    oq0Var.I.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.g5.K(oq0Var.getParentActivity(), oq0Var.F.a(), new fq0(oq0Var, 2));
                    return;
                }
                oq0Var.V(oq0Var.f38729b, oq0Var.f38730c, true, 0);
                oq0Var.finishFragment();
                return;
            case 22:
                fr0 fr0Var = (fr0) obj;
                org.telegram.ui.ActionBar.m1 m1Var2 = fr0Var.m0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    fr0Var.m0.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.g5.K(fr0Var.getParentActivity(), fr0Var.U.a(), new sq0(fr0Var, 1));
                    return;
                } else {
                    fr0Var.e0(0, true);
                    return;
                }
            case 23:
                MessageObject messageObject = (MessageObject) obj;
                int i15 = PopupNotificationActivity.f32135b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i12).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i12 == 0) {
                    q01 q01Var = profileActivity.O;
                    if (!q01Var.C1) {
                        if (xv0.x0(q01Var.getClosestTab())) {
                            q01 q01Var2 = profileActivity.O;
                            profileActivity.O.P0(profileActivity, profileActivity.a(), q01Var2.i1(q01Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            kc D = kc.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.f7311x = new p01(profileActivity);
                            D.Q(null);
                            return;
                        }
                    }
                }
                if (xv0.x0(profileActivity.O.getClosestTab())) {
                    long a2 = profileActivity.a();
                    q01 q01Var3 = profileActivity.O;
                    int i16 = q01Var3.i1(q01Var3.getClosestTab());
                    String w9 = profileActivity.getMessagesController().getStoriesController().w(i16, a2);
                    org.telegram.messenger.r8 r8Var = profileActivity.f32398x5;
                    if (r8Var != null) {
                        r8Var.run();
                        profileActivity.f32398x5 = null;
                    }
                    org.telegram.ui.Components.sc.e();
                    ArrayList arrayList6 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i17 = 0; i17 < actionModeSelected.size(); i17++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i17).storyItem;
                            if (storyItem != null) {
                                arrayList6.add(storyItem);
                            }
                        }
                    }
                    profileActivity.O.L(false);
                    if (!arrayList6.isEmpty()) {
                        org.telegram.messenger.k7 k7Var = new org.telegram.messenger.k7(profileActivity, a2, i16, arrayList6, 14);
                        profileActivity.getMessagesController().getStoriesController().c0(i16, a2, arrayList6);
                        org.telegram.ui.Components.zc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList6.size(), w9)), LocaleController.getString(R.string.UndoNoCaps), k7Var).j();
                        return;
                    }
                    return;
                }
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                org.telegram.messenger.r8 r8Var2 = profileActivity.f32398x5;
                if (r8Var2 != null) {
                    r8Var2.run();
                    profileActivity.f32398x5 = null;
                }
                org.telegram.ui.Components.sc.e();
                if (profileActivity.O.getClosestTab() == 9) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ArrayList arrayList7 = new ArrayList();
                SparseArray<MessageObject> actionModeSelected2 = profileActivity.O.getActionModeSelected();
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
                profileActivity.O.L(false);
                if (z11) {
                    profileActivity.O.Z0(8);
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
                    profileActivity.f32398x5 = new org.telegram.messenger.r8(profileActivity, clientUserId, arrayList7, z11, 9);
                    org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 7);
                    if (z14) {
                        j10 = org.telegram.ui.Components.zc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), fVar).j();
                    } else {
                        j10 = org.telegram.ui.Components.zc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, fVar).j();
                    }
                    j10.v = new rr0(26, profileActivity, zArr3);
                    return;
                }
                return;
            case 25:
                hb1 hb1Var = (hb1) obj;
                hb1Var.f36487i0.D(i12);
                hb1Var.m0(i12, true);
                return;
            case 26:
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) obj;
                EditText editText = h9Var.f32990a;
                TextView[] textViewArr = h9Var.N;
                TextView textView = textViewArr[i12];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i12].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    h9Var.a();
                    h9Var.a();
                    Runnable runnable = h9Var.f32995r;
                    if (runnable != null) {
                        editText.post(runnable);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                zh.q0 q0Var = ((zh.r0) obj).f51043j0;
                int i20 = zh.q0.f51000s;
                q0Var.a(i12);
                return;
            default:
                ((zh.q0) obj).a(i12);
                return;
        }
    }

    public m4(MessageObject messageObject, int i10) {
        this.f7423a = 23;
        this.f7424b = i10;
        this.f7425c = messageObject;
    }
}
