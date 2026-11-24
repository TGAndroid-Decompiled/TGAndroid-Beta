package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UserInfoActivity;
public final class sp8 extends c6 {
    public final Context a;
    public final ProfileActivity b;

    public sp8(ProfileActivity profileActivity, Context context) {
        this.b = profileActivity;
        this.a = context;
    }

    @Override
    public final void b(int i) {
        TLRPC.EncryptedChat encryptedChat;
        long j;
        int i2;
        ?? r6;
        int i3;
        int i4;
        String str;
        int i5;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        int i6;
        Integer num;
        int i7;
        boolean z;
        int i8;
        int i9;
        int i10;
        String str2;
        int i11;
        kfa kfaVar;
        ProfileActivity profileActivity = this.b;
        if (profileActivity.getParentActivity() != null) {
            if (i == -1) {
                wp8 wp8Var = profileActivity.O;
                if (wp8Var != null && (kfaVar = wp8Var.L0) != null && kfaVar.o0) {
                    profileActivity.I3();
                    return;
                } else {
                    profileActivity.finishFragment();
                    return;
                }
            }
            boolean z2 = false;
            if (i == 2) {
                profileActivity.T2(false);
            } else if (i == 1) {
                TLRPC.User W1 = profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", W1.id);
                bundle.putBoolean("addContact", true);
                tu2 tu2Var = new tu2(bundle, profileActivity.A0);
                tu2Var.P = new wn8(profileActivity, W1);
                profileActivity.presentFragment(tu2Var);
            } else {
                String str3 = null;
                if (i == 3) {
                    Bundle j2 = td4.j(3, "onlySelect", "dialogsType", true);
                    j2.putString("selectAlertString", jb6.M0(2131745364, null));
                    j2.putString("selectAlertStringGroup", jb6.M0(2131745365, null));
                    nk3 nk3Var = new nk3(j2);
                    nk3Var.E2 = profileActivity;
                    profileActivity.presentFragment(nk3Var);
                } else if (i == 4) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", profileActivity.e1);
                    profileActivity.presentFragment(new tu2(bundle2, profileActivity.A0));
                } else if (i == 5) {
                    TLRPC.User W12 = profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1));
                    if (W12 != null && profileActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                        String M0 = jb6.M0(2131751489, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131754068, null);
                        alertDialog$Builder.j(jb6.M0(2131751535, null), new cz6(this, W12, (byte) 29));
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        profileActivity.showDialog(heVar);
                        TextView textView = (TextView) heVar.c(-1);
                        if (textView != null) {
                            anb.X(textView, cmb.p7, profileActivity.A0);
                        }
                    }
                } else if (i == 7) {
                    profileActivity.N2(false);
                } else if (i == 45) {
                    profileActivity.N2(true);
                } else if (i == 46) {
                    if (!profileActivity.getUserConfig().p()) {
                        Activity parentActivity = profileActivity.getParentActivity();
                        i11 = ((d) profileActivity).currentAccount;
                        new kj8(profileActivity, parentActivity, i11, false, 41, false, null).show();
                        return;
                    }
                    ylb ylbVar = profileActivity.A0;
                    pp8 pp8Var = new pp8(this, (byte) 0);
                    Pattern pattern = ik.a;
                    Context context = this.a;
                    if (context != null) {
                        boolean[] zArr = new boolean[1];
                        my0 h = hg9.h(1, null, context, false);
                        zx0 zx0Var = h.y0;
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.setClipChildren(false);
                        linearLayout.setClipToPadding(false);
                        ?? imageView = new ImageView(context);
                        linearLayout.addView((View) imageView, qoe.t(110, 110, 17, 0, 21, 0, 11));
                        imageView.f(2131624173, 110, 110, null);
                        imageView.setAutoRepeat(false);
                        imageView.d();
                        TextView textView2 = new TextView(context);
                        textView2.setTypeface(gm.o());
                        textView2.setGravity(17);
                        textView2.setText(jb6.M0(2131751359, null));
                        textView2.setTextSize(1, 20.0f);
                        int i12 = cmb.F6;
                        anb.X(textView2, i12, ylbVar);
                        linearLayout.addView(textView2, qoe.t(-1, -2, 17, 20, 0, 20, 14));
                        lj8 lj8Var = new lj8(context, ylbVar);
                        lj8Var.a.l(jb6.M0(2131751358, null), false);
                        lj8Var.b.setText(jb6.M0(2131751355, null));
                        lj8Var.d.setVisibility(8);
                        ImageView imageView2 = lj8Var.c;
                        imageView2.setImageResource(2131231852);
                        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                        anb.s(imageView2, i12, ylbVar, mode);
                        linearLayout.addView(lj8Var, qoe.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        lj8 lj8Var2 = new lj8(context, ylbVar);
                        lj8Var2.a.l(jb6.M0(2131751357, null), false);
                        lj8Var2.b.setText(jb6.M0(2131751354, null));
                        lj8Var2.d.setVisibility(8);
                        ImageView imageView3 = lj8Var2.c;
                        imageView3.setImageResource(2131231884);
                        anb.s(imageView3, i12, ylbVar, mode);
                        linearLayout.addView(lj8Var2, qoe.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        lj8 lj8Var3 = new lj8(context, ylbVar);
                        lj8Var3.a.l(jb6.M0(2131751356, null), false);
                        lj8Var3.b.setText(jb6.M0(2131751353, null));
                        lj8Var3.d.setVisibility(8);
                        ImageView imageView4 = lj8Var3.c;
                        imageView4.setImageResource(2131231793);
                        anb.s(imageView4, i12, ylbVar, mode);
                        linearLayout.addView(lj8Var3, qoe.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                        b61 b61Var = new b61(ylbVar, context, true);
                        b61Var.setOnClickListener(new t(zArr, zx0Var, (byte) 16));
                        b61Var.f();
                        b61Var.i(jb6.M0(2131751360, null), false, true);
                        linearLayout.addView(b61Var, qoe.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                        h.O = linearLayout;
                        h.show();
                        h.n(new pf2(zArr, pp8Var, (byte) 24));
                    }
                } else if (i == 47) {
                    profileActivity.getMessagesController().l5(profileActivity.e1, 0, false, new gp2(profileActivity, false, (byte) 1));
                } else if (i == 23) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                    String J0 = jb6.J0(1, "DeleteTopics");
                    he heVar2 = alertDialog$Builder2.a;
                    heVar2.S = J0;
                    i10 = ((d) profileActivity).currentAccount;
                    TLRPC.TL_forumTopic f = oc7.r1(i10).g4.f(profileActivity.f1, profileActivity.g1);
                    if (f == null) {
                        str2 = "topic";
                    } else {
                        str2 = f.title;
                    }
                    heVar2.U = jb6.a0("DeleteSelectedTopic", null, 2131751435, str2);
                    alertDialog$Builder2.j(jb6.M0(2131751535, null), new ee(this) {
                        public final sp8 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void r(defpackage.he r13, int r14) {
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.qp8.r(he, int):void");
                        }
                    });
                    alertDialog$Builder2.g(jb6.M0(2131752542, null), new i98((byte) 5));
                    heVar2.show();
                    TextView textView3 = (TextView) heVar2.c(-1);
                    if (textView3 != null) {
                        anb.X(textView3, cmb.p7, null);
                    }
                } else if (i == 24) {
                    da9.F0(profileActivity.a(), profileActivity);
                } else if (i == 12) {
                    if (profileActivity.q1) {
                        profileActivity.presentFragment(wvb.f0(profileActivity.f1, profileActivity.g1));
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    long j3 = profileActivity.f1;
                    if (j3 != 0) {
                        bundle3.putLong("chat_id", j3);
                    } else if (profileActivity.s2) {
                        bundle3.putLong("user_id", profileActivity.e1);
                    }
                    ba2 ba2Var = new ba2(bundle3);
                    TLRPC.ChatFull chatFull = profileActivity.v2;
                    if (chatFull != null) {
                        ba2Var.q0(chatFull);
                    } else {
                        ba2Var.r0(profileActivity.w2);
                    }
                    profileActivity.presentFragment(ba2Var);
                } else if (i == 41) {
                    profileActivity.presentFragment(new UserInfoActivity());
                } else if (i == 9) {
                    TLRPC.User W13 = profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1));
                    if (W13 != null) {
                        Bundle j4 = td4.j(2, "onlySelect", "dialogsType", true);
                        j4.putBoolean("resetDelegate", false);
                        j4.putBoolean("closeFragment", false);
                        nk3 nk3Var2 = new nk3(j4);
                        nk3Var2.E2 = new wu2(this, W13, nk3Var2, (byte) 24);
                        profileActivity.presentFragment(nk3Var2);
                    }
                } else if (i == 10) {
                    profileActivity.Y2();
                } else if (i == 14) {
                    try {
                        if (profileActivity.E2 != null) {
                            j = pg3.E(encryptedChat.id);
                        } else {
                            j = profileActivity.e1;
                            if (j == 0) {
                                long j5 = profileActivity.f1;
                                if (j5 != 0) {
                                    j = -j5;
                                } else {
                                    return;
                                }
                            }
                        }
                        hs6 mediaDataController = profileActivity.getMediaDataController();
                        Pattern pattern2 = hs6.U1;
                        mediaDataController.z0(j, 0, null);
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                } else {
                    if (i != 15) {
                        i2 = 16;
                        if (i != 16) {
                            if (i == 17) {
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", profileActivity.f1);
                                bundle4.putInt("type", 2);
                                bundle4.putBoolean("open_search", true);
                                wg2 wg2Var = new wg2(bundle4);
                                wg2Var.B0(profileActivity.v2);
                                profileActivity.presentFragment(wg2Var);
                                return;
                            } else if (i == 18) {
                                profileActivity.b3();
                                return;
                            } else if (i == 19) {
                                profileActivity.presentFragment(xza.e0(profileActivity.getMessagesController().L0(Long.valueOf(profileActivity.f1)), false));
                                return;
                            } else if (i == 22) {
                                profileActivity.f3();
                                return;
                            } else if (i == 38) {
                                profileActivity.V2();
                                return;
                            } else if (i == 48) {
                                rrc rrcVar = new rrc(profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1)));
                                rrcVar.g0 = true;
                                profileActivity.presentFragment(rrcVar);
                                return;
                            } else if (i == 39) {
                                Bundle j6 = kt6.j(2, "type");
                                j6.putLong("dialog_id", -profileActivity.f1);
                                cm6 cm6Var = new cm6(j6, null);
                                cm6Var.c = profileActivity.v2;
                                profileActivity.presentFragment(cm6Var);
                                return;
                            } else if (i == 20) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                                String M02 = jb6.M0(2131754043, null);
                                he heVar3 = alertDialog$Builder3.a;
                                heVar3.S = M02;
                                heVar3.U = jb6.M0(2131754044, null);
                                alertDialog$Builder3.j(jb6.M0(2131744604, null), new ee(this) {
                                    public final sp8 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override
                                    public final void r(defpackage.he r13, int r14) {
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.qp8.r(he, int):void");
                                    }
                                });
                                alertDialog$Builder3.g(jb6.M0(2131752542, null), null);
                                profileActivity.showDialog(heVar3);
                                return;
                            } else if (i == 44) {
                                i9 = ((d) profileActivity).currentAccount;
                                wu0.l(i9, profileActivity.e1);
                                return;
                            } else if (i == 21) {
                                if (profileActivity.getParentActivity() != null) {
                                    if ((Build.VERSION.SDK_INT <= 28 || e21.b) && profileActivity.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                                        profileActivity.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                        return;
                                    }
                                    zo8 zo8Var = profileActivity.o0;
                                    gn5 D = zo8Var.D(zo8Var.getRealPosition());
                                    if (D != null) {
                                        if (D.p == 2) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        i8 = ((d) profileActivity).currentAccount;
                                        bc4.G(i8);
                                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = D.f;
                                        if (z) {
                                            str3 = "mp4";
                                        }
                                        File J = bc4.J(tL_fileLocationToBeDeprecated2, str3, true, true);
                                        if (z && !J.exists()) {
                                            J = new File(bc4.z(0), bc4.r("mp4", D.f));
                                        }
                                        if (J.exists()) {
                                            MediaController.d0(J.toString(), profileActivity.getParentActivity(), 0, null, null, new ra((byte) 5, this, z));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (i == 30) {
                                profileActivity.presentFragment(new UserInfoActivity());
                                return;
                            } else if (i == 40) {
                                d38 d38Var = new d38();
                                d38Var.I = profileActivity;
                                profileActivity.presentFragment(d38Var);
                                return;
                            } else if (i == 42) {
                                TLRPC.User W14 = profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1));
                                if (gm.g(profileActivity.getMessagesController().N2 + "/" + m9c.p(W14))) {
                                    c41.b0(profileActivity).k(false).j();
                                    return;
                                }
                                return;
                            } else if (i == 43) {
                                profileActivity.presentFragment(new uf1(null));
                                return;
                            } else if (i == 31) {
                                profileActivity.presentFragment(new d(null));
                                return;
                            } else if (i == 33) {
                                int realPosition = profileActivity.o0.getRealPosition();
                                TLRPC.Photo F = profileActivity.o0.F(realPosition);
                                if (F != null) {
                                    zo8 zo8Var2 = profileActivity.o0;
                                    ArrayList arrayList = zo8Var2.c1;
                                    ArrayList arrayList2 = zo8Var2.b1;
                                    ArrayList arrayList3 = zo8Var2.a1;
                                    ArrayList arrayList4 = zo8Var2.Z0;
                                    ArrayList arrayList5 = zo8Var2.X0;
                                    ArrayList arrayList6 = zo8Var2.V0;
                                    ArrayList arrayList7 = zo8Var2.Y0;
                                    ArrayList arrayList8 = zo8Var2.W0;
                                    xb7 xb7Var = zo8Var2.T0;
                                    if (xb7Var != null) {
                                        xb7Var.c(realPosition);
                                    } else if (realPosition > 0 && realPosition < arrayList8.size()) {
                                        zo8Var2.d1++;
                                        arrayList8.remove(realPosition);
                                        arrayList8.add(0, (TLRPC.Photo) arrayList8.get(realPosition));
                                        arrayList6.remove(realPosition);
                                        arrayList6.add(0, (String) arrayList6.get(realPosition));
                                        ArrayList arrayList9 = zo8Var2.U0;
                                        arrayList9.add(0, (String) arrayList9.remove(realPosition));
                                        arrayList5.remove(realPosition);
                                        arrayList5.add(0, (gn5) arrayList5.get(realPosition));
                                        arrayList7.remove(realPosition);
                                        arrayList7.add(0, (gn5) arrayList7.get(realPosition));
                                        arrayList4.remove(realPosition);
                                        arrayList4.add(0, (gn5) arrayList4.get(realPosition));
                                        arrayList3.remove(realPosition);
                                        arrayList3.add(0, (jbc) arrayList3.get(realPosition));
                                        arrayList2.remove(realPosition);
                                        arrayList2.add(0, (Integer) arrayList2.get(realPosition));
                                        arrayList.remove(realPosition);
                                        arrayList.add(0, (Float) arrayList.get(realPosition));
                                        zo8Var2.Q0 = (gn5) arrayList7.get(0);
                                    }
                                    TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                    tL_photos_updateProfilePhoto.id = tL_inputPhoto;
                                    tL_inputPhoto.id = F.id;
                                    tL_inputPhoto.access_hash = F.access_hash;
                                    tL_inputPhoto.file_reference = F.file_reference;
                                    z8c userConfig = profileActivity.getUserConfig();
                                    profileActivity.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new fm8(this, userConfig, F, (byte) 4));
                                    UndoView undoView = profileActivity.M;
                                    long j7 = profileActivity.e1;
                                    if (F.video_sizes.isEmpty()) {
                                        num = null;
                                    } else {
                                        num = 1;
                                    }
                                    undoView.m(num, 22, j7);
                                    TLRPC.User W15 = profileActivity.getMessagesController().W1(Long.valueOf(userConfig.n));
                                    TLRPC.PhotoSize w = bc4.w(F.sizes, 800, false, null, false);
                                    if (W15 != null) {
                                        TLRPC.PhotoSize w2 = bc4.w(F.sizes, 90, false, null, false);
                                        TLRPC.UserProfilePhoto userProfilePhoto = W15.photo;
                                        userProfilePhoto.photo_id = F.id;
                                        userProfilePhoto.photo_small = w2.location;
                                        userProfilePhoto.photo_big = w.location;
                                        userConfig.v(W15);
                                        userConfig.u(true);
                                        i7 = ((d) profileActivity).currentAccount;
                                        nm7.f(i7).k(nm7.j0, new Object[0]);
                                        profileActivity.h4(true);
                                    }
                                    zo8 zo8Var3 = profileActivity.o0;
                                    zo8Var3.E0.g();
                                    zo8Var3.L();
                                    return;
                                }
                                return;
                            } else if (i == 34) {
                                i3 = ((d) profileActivity).currentAccount;
                                if (oc7.r1(i3).u2()) {
                                    i6 = ((d) profileActivity).currentAccount;
                                    h5.b(i6);
                                    return;
                                }
                                int realPosition2 = profileActivity.o0.getRealPosition();
                                gn5 D2 = profileActivity.o0.D(realPosition2);
                                if (D2 != null) {
                                    i4 = ((d) profileActivity).currentAccount;
                                    bc4.G(i4);
                                    Drawable[] drawableArr = PhotoViewer.d9;
                                    File J2 = bc4.J(D2.f, PhotoViewer.o0(D2), true, true);
                                    if (D2.p == 2) {
                                        z2 = true;
                                    }
                                    if (z2) {
                                        gn5 G = profileActivity.o0.G(realPosition2);
                                        i5 = ((d) profileActivity).currentAccount;
                                        bc4.G(i5);
                                        if (G == null) {
                                            tL_fileLocationToBeDeprecated = null;
                                        } else {
                                            tL_fileLocationToBeDeprecated = G.f;
                                        }
                                        str = bc4.J(tL_fileLocationToBeDeprecated, PhotoViewer.o0(G), true, true).getAbsolutePath();
                                    } else {
                                        str = null;
                                    }
                                    profileActivity.r0.p(J2.getAbsolutePath(), str, z2);
                                    return;
                                }
                                return;
                            } else if (i == 35) {
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                                zo8 zo8Var4 = profileActivity.o0;
                                gn5 D3 = zo8Var4.D(zo8Var4.getRealPosition());
                                if (D3 != null) {
                                    byte b = D3.p;
                                    he heVar4 = alertDialog$Builder4.a;
                                    if (b == 2) {
                                        r6 = 0;
                                        heVar4.S = jb6.M0(2131754048, null);
                                        heVar4.U = jb6.M0(2131754050, null);
                                    } else {
                                        r6 = 0;
                                        heVar4.S = jb6.M0(2131754059, null);
                                        heVar4.U = jb6.M0(2131754061, null);
                                    }
                                    alertDialog$Builder4.j(jb6.M0(2131751535, r6), new ee(this) {
                                        public final sp8 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override
                                        public final void r(defpackage.he r13, int r14) {
                                            throw new UnsupportedOperationException("Method not decompiled: defpackage.qp8.r(he, int):void");
                                        }
                                    });
                                    alertDialog$Builder4.g(jb6.M0(2131752542, r6), r6);
                                    profileActivity.showDialog(heVar4);
                                    TextView textView4 = (TextView) heVar4.c(-1);
                                    if (textView4 != null) {
                                        anb.X(textView4, cmb.p7, profileActivity.A0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (i == 36) {
                                profileActivity.a3();
                                return;
                            } else {
                                return;
                            }
                        }
                    } else {
                        i2 = 16;
                    }
                    if (i == i2) {
                        z2 = true;
                    }
                    profileActivity.U2(z2);
                }
            }
        }
    }
}
