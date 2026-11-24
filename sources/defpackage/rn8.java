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
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UserInfoActivity;
public final class rn8 extends c6 {
    public final Context a;
    public final ProfileActivity b;

    public rn8(ProfileActivity profileActivity, Context context) {
        this.b = profileActivity;
        this.a = context;
    }

    @Override
    public final void b(int i) {
        TLRPC.EncryptedChat encryptedChat;
        long j;
        int i2;
        int i3;
        int i4;
        int i5;
        Integer num;
        int i6;
        boolean z;
        int i7;
        int i8;
        TL_bots.BotInfo botInfo;
        int i9;
        String str;
        int i10;
        kda kdaVar;
        if (this.b.getParentActivity() != null) {
            if (i == -1) {
                ProfileActivity profileActivity = this.b;
                vn8 vn8Var = profileActivity.O;
                if (vn8Var != null && (kdaVar = vn8Var.L0) != null && kdaVar.o0) {
                    profileActivity.E3();
                    return;
                } else {
                    profileActivity.finishFragment();
                    return;
                }
            }
            boolean z2 = false;
            int i11 = 0;
            boolean z3 = false;
            if (i == 2) {
                this.b.Q2(false);
            } else if (i == 1) {
                TLRPC.User V1 = this.b.getMessagesController().V1(Long.valueOf(this.b.e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", V1.id);
                bundle.putBoolean("addContact", true);
                ProfileActivity profileActivity2 = this.b;
                it2 it2Var = new it2(bundle, profileActivity2.A0);
                it2Var.P = new ul8(profileActivity2, V1);
                profileActivity2.presentFragment(it2Var);
            } else {
                String str2 = null;
                String str3 = null;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
                if (i == 3) {
                    Bundle j2 = tb4.j(3, "onlySelect", "dialogsType", true);
                    j2.putString("selectAlertString", k96.M0(2131745438, null));
                    j2.putString("selectAlertStringGroup", k96.M0(2131745439, null));
                    cj3 cj3Var = new cj3(j2);
                    ProfileActivity profileActivity3 = this.b;
                    cj3Var.E2 = profileActivity3;
                    profileActivity3.presentFragment(cj3Var);
                } else if (i == 4) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", this.b.e1);
                    ProfileActivity profileActivity4 = this.b;
                    profileActivity4.presentFragment(new it2(bundle2, profileActivity4.A0));
                } else if (i == 5) {
                    TLRPC.User V12 = this.b.getMessagesController().V1(Long.valueOf(this.b.e1));
                    if (V12 != null && this.b.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.b.A0, this.b.getParentActivity());
                        alertDialog$Builder.a.S = k96.M0(2131751540, null);
                        alertDialog$Builder.a.U = k96.M0(2131754100, null);
                        alertDialog$Builder.j(k96.M0(2131751586, null), new dx6(this, V12, (byte) 28));
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        hd hdVar = alertDialog$Builder.a;
                        this.b.showDialog(hdVar);
                        TextView textView = (TextView) hdVar.c(-1);
                        if (textView != null) {
                            zkb.X(textView, bkb.p7, this.b.A0);
                        }
                    }
                } else if (i == 7) {
                    this.b.K2(false);
                } else if (i == 45) {
                    this.b.K2(true);
                } else if (i == 46) {
                    if (!this.b.getUserConfig().p()) {
                        ProfileActivity profileActivity5 = this.b;
                        Activity parentActivity = profileActivity5.getParentActivity();
                        i10 = ((d) this.b).currentAccount;
                        new jh8(profileActivity5, parentActivity, i10, false, 41, false, null).show();
                        return;
                    }
                    Context context = this.a;
                    wjb wjbVar = this.b.A0;
                    w88 w88Var = new w88(this, (byte) 22);
                    Pattern pattern = ij.a;
                    if (context != null) {
                        boolean[] zArr = new boolean[1];
                        fx0 h = de9.h(1, null, context, false);
                        rw0 rw0Var = h.y0;
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.setClipChildren(false);
                        linearLayout.setClipToPadding(false);
                        ?? imageView = new ImageView(context);
                        linearLayout.addView((View) imageView, nme.t(110, 110, 17, 0, 21, 0, 11));
                        imageView.f(2131624173, 110, 110, null);
                        imageView.setAutoRepeat(false);
                        imageView.d();
                        TextView textView2 = new TextView(context);
                        textView2.setTypeface(gl.o());
                        textView2.setGravity(17);
                        textView2.setText(k96.M0(2131751410, null));
                        textView2.setTextSize(1, 20.0f);
                        int i12 = bkb.F6;
                        zkb.X(textView2, i12, wjbVar);
                        linearLayout.addView(textView2, nme.t(-1, -2, 17, 20, 0, 20, 14));
                        kh8 kh8Var = new kh8(context, wjbVar);
                        kh8Var.a.l(k96.M0(2131751409, null), false);
                        kh8Var.b.setText(k96.M0(2131751406, null));
                        kh8Var.d.setVisibility(8);
                        kh8Var.c.setImageResource(2131231851);
                        ImageView imageView2 = kh8Var.c;
                        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                        zkb.s(imageView2, i12, wjbVar, mode);
                        linearLayout.addView(kh8Var, nme.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        kh8 kh8Var2 = new kh8(context, wjbVar);
                        kh8Var2.a.l(k96.M0(2131751408, null), false);
                        kh8Var2.b.setText(k96.M0(2131751405, null));
                        kh8Var2.d.setVisibility(8);
                        kh8Var2.c.setImageResource(2131231883);
                        zkb.s(kh8Var2.c, i12, wjbVar, mode);
                        linearLayout.addView(kh8Var2, nme.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        kh8 kh8Var3 = new kh8(context, wjbVar);
                        kh8Var3.a.l(k96.M0(2131751407, null), false);
                        kh8Var3.b.setText(k96.M0(2131751404, null));
                        kh8Var3.d.setVisibility(8);
                        kh8Var3.c.setImageResource(2131231792);
                        zkb.s(kh8Var3.c, i12, wjbVar, mode);
                        linearLayout.addView(kh8Var3, nme.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                        u41 u41Var = new u41(wjbVar, context, true);
                        u41Var.setOnClickListener(new t(zArr, rw0Var, (byte) 16));
                        u41Var.f();
                        u41Var.i(k96.M0(2131751411, null), false, true);
                        linearLayout.addView(u41Var, nme.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                        h.O = linearLayout;
                        h.show();
                        h.n(new ee2(zArr, w88Var, (byte) 23));
                    }
                } else if (i == 47) {
                    ProfileActivity profileActivity6 = this.b;
                    profileActivity6.getMessagesController().j5(profileActivity6.e1, 0, false, new vn2(profileActivity6, false, (byte) 1));
                } else if (i == 23) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.b.getParentActivity());
                    alertDialog$Builder2.a.S = k96.J0(1, "DeleteTopics");
                    i9 = ((d) this.b).currentAccount;
                    pub pubVar = na7.q1(i9).g4;
                    ProfileActivity profileActivity7 = this.b;
                    TLRPC.TL_forumTopic f = pubVar.f(profileActivity7.f1, profileActivity7.g1);
                    if (f == null) {
                        str = "topic";
                    } else {
                        str = f.title;
                    }
                    alertDialog$Builder2.a.U = k96.a0("DeleteSelectedTopic", null, 2131751486, str);
                    alertDialog$Builder2.j(k96.M0(2131751586, null), new ed(this) {
                        public final rn8 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void u(defpackage.hd r13, int r14) {
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.pn8.u(hd, int):void");
                        }
                    });
                    alertDialog$Builder2.g(k96.M0(2131752577, null), new sc8((byte) 3));
                    hd hdVar2 = alertDialog$Builder2.a;
                    hdVar2.show();
                    TextView textView3 = (TextView) hdVar2.c(-1);
                    if (textView3 != null) {
                        zkb.X(textView3, bkb.p7, null);
                    }
                } else if (i == 24) {
                    ProfileActivity profileActivity8 = this.b;
                    b89.E0(profileActivity8.a(), profileActivity8);
                } else if (i == 12) {
                    ProfileActivity profileActivity9 = this.b;
                    if (profileActivity9.q1) {
                        profileActivity9.presentFragment(vtb.e0(profileActivity9.f1, profileActivity9.g1));
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    ProfileActivity profileActivity10 = this.b;
                    long j3 = profileActivity10.f1;
                    if (j3 != 0) {
                        bundle3.putLong("chat_id", j3);
                    } else if (profileActivity10.s2) {
                        bundle3.putLong("user_id", profileActivity10.e1);
                    }
                    p82 p82Var = new p82(bundle3);
                    ProfileActivity profileActivity11 = this.b;
                    TLRPC.ChatFull chatFull = profileActivity11.v2;
                    if (chatFull != null) {
                        p82Var.p0(chatFull);
                    } else {
                        p82Var.q0(profileActivity11.w2);
                    }
                    this.b.presentFragment(p82Var);
                } else if (i == 41) {
                    this.b.presentFragment(new UserInfoActivity());
                } else if (i == 9) {
                    TLRPC.User V13 = this.b.getMessagesController().V1(Long.valueOf(this.b.e1));
                    if (V13 != null) {
                        Bundle j4 = tb4.j(2, "onlySelect", "dialogsType", true);
                        j4.putBoolean("resetDelegate", false);
                        j4.putBoolean("closeFragment", false);
                        cj3 cj3Var2 = new cj3(j4);
                        cj3Var2.E2 = new lt2(this, V13, cj3Var2, (byte) 24);
                        this.b.presentFragment(cj3Var2);
                    }
                } else if (i == 10) {
                    this.b.V2();
                } else if (i == 14) {
                    try {
                        ProfileActivity profileActivity12 = this.b;
                        if (profileActivity12.E2 != null) {
                            j = cf3.E(encryptedChat.id);
                        } else {
                            long j5 = profileActivity12.e1;
                            if (j5 != 0) {
                                j = j5;
                            } else {
                                long j6 = profileActivity12.f1;
                                if (j6 != 0) {
                                    j = -j6;
                                } else {
                                    return;
                                }
                            }
                        }
                        hq6 mediaDataController = this.b.getMediaDataController();
                        Pattern pattern2 = hq6.U1;
                        mediaDataController.z0(j, 0, null);
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                } else if (i != 15 && i != 16) {
                    if (i == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", this.b.f1);
                        bundle4.putInt("type", 2);
                        bundle4.putBoolean("open_search", true);
                        kf2 kf2Var = new kf2(bundle4);
                        kf2Var.A0(this.b.v2);
                        this.b.presentFragment(kf2Var);
                    } else if (i == 18) {
                        this.b.Y2();
                    } else if (i == 19) {
                        this.b.presentFragment(uxa.d0(this.b.getMessagesController().K0(Long.valueOf(this.b.f1)), false));
                    } else if (i == 22) {
                        this.b.b3();
                    } else if (i == 38) {
                        this.b.S2();
                    } else if (i == 48) {
                        ProfileActivity profileActivity13 = this.b;
                        qpc qpcVar = new qpc(profileActivity13.getMessagesController().V1(Long.valueOf(this.b.e1)));
                        qpcVar.g0 = true;
                        profileActivity13.presentFragment(qpcVar);
                    } else if (i == 39) {
                        Bundle j7 = ls6.j(2, "type");
                        j7.putLong("dialog_id", -this.b.f1);
                        zj6 zj6Var = new zj6(j7, null);
                        ProfileActivity profileActivity14 = this.b;
                        zj6Var.c = profileActivity14.v2;
                        profileActivity14.presentFragment(zj6Var);
                    } else if (i == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, this.b.A0, this.b.getParentActivity());
                        alertDialog$Builder3.a.S = k96.M0(2131754075, null);
                        alertDialog$Builder3.a.U = k96.M0(2131754076, null);
                        alertDialog$Builder3.j(k96.M0(2131744678, null), new ed(this) {
                            public final rn8 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void u(defpackage.hd r13, int r14) {
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.pn8.u(hd, int):void");
                            }
                        });
                        alertDialog$Builder3.g(k96.M0(2131752577, null), null);
                        this.b.showDialog(alertDialog$Builder3.a);
                    } else if (i == 44) {
                        i8 = ((d) this.b).currentAccount;
                        long j8 = this.b.e1;
                        TLRPC.UserFull W1 = na7.q1(i8).W1(j8);
                        if (W1 != null && (botInfo = W1.bot_info) != null) {
                            String str4 = botInfo.privacy_policy_url;
                            if (str4 == null && str4 == null) {
                                ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
                                int size = arrayList.size();
                                while (true) {
                                    if (i11 < size) {
                                        TLRPC.BotCommand botCommand = arrayList.get(i11);
                                        i11++;
                                        if ("privacy".equals(botCommand.command)) {
                                            break;
                                        }
                                    } else {
                                        str4 = k96.M0(2131753095, null);
                                        break;
                                    }
                                }
                            }
                            if (str4 != null) {
                                d01.t(a.b, str4);
                                return;
                            }
                            d S = LaunchActivity.S();
                            if (S != null) {
                                if (!(S instanceof mu1) || ((mu1) S).a() != j8) {
                                    S.presentFragment(mu1.W9(j8));
                                }
                                gl.d3(new am0(i8, j8, (byte) 1), 150L);
                            }
                        }
                    } else if (i == 21) {
                        if (this.b.getParentActivity() != null) {
                            if ((Build.VERSION.SDK_INT <= 28 || w01.b) && this.b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                                this.b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            ym8 ym8Var = this.b.o0;
                            gl5 D = ym8Var.D(ym8Var.getRealPosition());
                            if (D != null) {
                                if (D.p == 2) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                i7 = ((d) this.b).currentAccount;
                                ba4.G(i7);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = D.f;
                                if (z) {
                                    str3 = "mp4";
                                }
                                File J = ba4.J(tL_fileLocationToBeDeprecated2, str3, true, true);
                                if (z && !J.exists()) {
                                    J = new File(ba4.z(0), ba4.r("mp4", D.f));
                                }
                                if (J.exists()) {
                                    MediaController.d0(J.toString(), this.b.getParentActivity(), 0, null, null, new ra((byte) 5, this, z));
                                }
                            }
                        }
                    } else if (i == 30) {
                        this.b.presentFragment(new UserInfoActivity());
                    } else if (i == 40) {
                        ProfileActivity profileActivity15 = this.b;
                        a18 a18Var = new a18();
                        a18Var.I = this.b;
                        profileActivity15.presentFragment(a18Var);
                    } else if (i == 42) {
                        TLRPC.User V14 = this.b.getMessagesController().V1(Long.valueOf(this.b.e1));
                        if (gl.g(this.b.getMessagesController().N2 + "/" + l7c.p(V14))) {
                            u21.b0(this.b).k(false).j();
                        }
                    } else if (i == 43) {
                        this.b.presentFragment(new me1(null));
                    } else if (i == 31) {
                        this.b.presentFragment(new d(null));
                    } else if (i == 33) {
                        int realPosition = this.b.o0.getRealPosition();
                        TLRPC.Photo F = this.b.o0.F(realPosition);
                        if (F != null) {
                            ym8 ym8Var2 = this.b.o0;
                            ArrayList arrayList2 = ym8Var2.c1;
                            ArrayList arrayList3 = ym8Var2.b1;
                            ArrayList arrayList4 = ym8Var2.a1;
                            ArrayList arrayList5 = ym8Var2.Z0;
                            ArrayList arrayList6 = ym8Var2.X0;
                            ArrayList arrayList7 = ym8Var2.V0;
                            ArrayList arrayList8 = ym8Var2.Y0;
                            ArrayList arrayList9 = ym8Var2.W0;
                            w97 w97Var = ym8Var2.T0;
                            if (w97Var != null) {
                                w97Var.c(realPosition);
                            } else if (realPosition > 0 && realPosition < arrayList9.size()) {
                                ym8Var2.d1++;
                                arrayList9.remove(realPosition);
                                arrayList9.add(0, (TLRPC.Photo) arrayList9.get(realPosition));
                                arrayList7.remove(realPosition);
                                arrayList7.add(0, (String) arrayList7.get(realPosition));
                                ArrayList arrayList10 = ym8Var2.U0;
                                arrayList10.add(0, (String) arrayList10.remove(realPosition));
                                arrayList6.remove(realPosition);
                                arrayList6.add(0, (gl5) arrayList6.get(realPosition));
                                arrayList8.remove(realPosition);
                                arrayList8.add(0, (gl5) arrayList8.get(realPosition));
                                arrayList5.remove(realPosition);
                                arrayList5.add(0, (gl5) arrayList5.get(realPosition));
                                arrayList4.remove(realPosition);
                                arrayList4.add(0, (i9c) arrayList4.get(realPosition));
                                arrayList3.remove(realPosition);
                                arrayList3.add(0, (Integer) arrayList3.get(realPosition));
                                arrayList2.remove(realPosition);
                                arrayList2.add(0, (Float) arrayList2.get(realPosition));
                                ym8Var2.Q0 = (gl5) arrayList8.get(0);
                            }
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.id = tL_inputPhoto;
                            tL_inputPhoto.id = F.id;
                            tL_inputPhoto.access_hash = F.access_hash;
                            tL_inputPhoto.file_reference = F.file_reference;
                            y6c userConfig = this.b.getUserConfig();
                            this.b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ck8(this, userConfig, F, (byte) 4));
                            ProfileActivity profileActivity16 = this.b;
                            UndoView undoView = profileActivity16.M;
                            long j9 = profileActivity16.e1;
                            if (F.video_sizes.isEmpty()) {
                                num = null;
                            } else {
                                num = 1;
                            }
                            undoView.m(num, 22, j9);
                            TLRPC.User V15 = this.b.getMessagesController().V1(Long.valueOf(userConfig.n));
                            TLRPC.PhotoSize w = ba4.w(F.sizes, 800, false, null, false);
                            if (V15 != null) {
                                TLRPC.PhotoSize w2 = ba4.w(F.sizes, 90, false, null, false);
                                TLRPC.UserProfilePhoto userProfilePhoto = V15.photo;
                                userProfilePhoto.photo_id = F.id;
                                userProfilePhoto.photo_small = w2.location;
                                userProfilePhoto.photo_big = w.location;
                                userConfig.v(V15);
                                userConfig.u(true);
                                i6 = ((d) this.b).currentAccount;
                                kk7.f(i6).k(kk7.i0, new Object[0]);
                                this.b.d4(true);
                            }
                            ym8 ym8Var3 = this.b.o0;
                            ym8Var3.E0.g();
                            ym8Var3.L();
                        }
                    } else if (i == 34) {
                        i2 = ((d) this.b).currentAccount;
                        boolean t2 = na7.q1(i2).t2();
                        ProfileActivity profileActivity17 = this.b;
                        if (t2) {
                            i5 = ((d) profileActivity17).currentAccount;
                            h5.b(i5);
                            return;
                        }
                        int realPosition2 = profileActivity17.o0.getRealPosition();
                        gl5 D2 = this.b.o0.D(realPosition2);
                        if (D2 != null) {
                            i3 = ((d) this.b).currentAccount;
                            ba4.G(i3);
                            Drawable[] drawableArr = PhotoViewer.d9;
                            File J2 = ba4.J(D2.f, PhotoViewer.o0(D2), true, true);
                            if (D2.p == 2) {
                                z3 = true;
                            }
                            if (z3) {
                                gl5 G = this.b.o0.G(realPosition2);
                                i4 = ((d) this.b).currentAccount;
                                ba4.G(i4);
                                if (G != null) {
                                    tL_fileLocationToBeDeprecated = G.f;
                                }
                                str2 = ba4.J(tL_fileLocationToBeDeprecated, PhotoViewer.o0(G), true, true).getAbsolutePath();
                            }
                            this.b.r0.p(J2.getAbsolutePath(), str2, z3);
                        }
                    } else if (i == 35) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.b.A0, this.b.getParentActivity());
                        ym8 ym8Var4 = this.b.o0;
                        gl5 D3 = ym8Var4.D(ym8Var4.getRealPosition());
                        if (D3 != null) {
                            if (D3.p == 2) {
                                alertDialog$Builder4.a.S = k96.M0(2131754080, null);
                                alertDialog$Builder4.a.U = k96.M0(2131754082, null);
                            } else {
                                alertDialog$Builder4.a.S = k96.M0(2131754091, null);
                                alertDialog$Builder4.a.U = k96.M0(2131754093, null);
                            }
                            alertDialog$Builder4.j(k96.M0(2131751586, null), new ed(this) {
                                public final rn8 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void u(defpackage.hd r13, int r14) {
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.pn8.u(hd, int):void");
                                }
                            });
                            alertDialog$Builder4.g(k96.M0(2131752577, null), null);
                            hd hdVar3 = alertDialog$Builder4.a;
                            this.b.showDialog(hdVar3);
                            TextView textView4 = (TextView) hdVar3.c(-1);
                            if (textView4 != null) {
                                zkb.X(textView4, bkb.p7, this.b.A0);
                            }
                        }
                    } else if (i == 36) {
                        this.b.X2();
                    }
                } else {
                    ProfileActivity profileActivity18 = this.b;
                    if (i == 16) {
                        z2 = true;
                    }
                    profileActivity18.R2(z2);
                }
            }
        }
    }
}
