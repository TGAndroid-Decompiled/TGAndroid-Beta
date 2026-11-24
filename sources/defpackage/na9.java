package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class na9 extends LinearLayout {
    public static final int c = 0;
    public TLRPC.RequestPeerType a;
    public ArrayList b;

    public final void a(Boolean bool, int i, int i2) {
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            ArrayList arrayList = this.b;
            if (booleanValue) {
                arrayList.add(oa9.a(gm.S2(jb6.M0(i, null))));
            } else {
                arrayList.add(oa9.a(gm.S2(jb6.M0(i2, null))));
            }
        }
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        int i;
        String M0;
        int i2;
        ArrayList arrayList = this.b;
        if (this.a != requestPeerType) {
            this.a = requestPeerType;
            removeAllViews();
            arrayList.clear();
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                a(((TLRPC.TL_requestPeerTypeUser) requestPeerType).premium, 2131747072, 2131747073);
            } else {
                boolean z = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
                if (z) {
                    a(requestPeerType.has_username, 2131747080, 2131747081);
                    Boolean bool = requestPeerType.bot_participant;
                    if (bool != null && bool.booleanValue()) {
                        arrayList.add(oa9.a(gm.S2(jb6.M0(2131747083, null))));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(oa9.a(gm.S2(jb6.M0(2131747082, null))));
                    }
                } else {
                    a(requestPeerType.has_username, 2131747074, 2131747075);
                    a(requestPeerType.forum, 2131747078, 2131747079);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(oa9.a(gm.S2(jb6.M0(2131747077, null))));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(oa9.a(gm.S2(jb6.M0(2131747076, null))));
                    }
                }
                Boolean bool5 = requestPeerType.creator;
                if (bool5 == null || !bool5.booleanValue()) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.user_admin_rights;
                    SpannableStringBuilder S2 = gm.S2(jb6.M0(2131747070, null));
                    SpannableStringBuilder S22 = gm.S2(jb6.M0(2131747071, null));
                    if (tL_chatAdminRights != null) {
                        ArrayList arrayList2 = new ArrayList();
                        if (tL_chatAdminRights.change_info) {
                            if (z) {
                                M0 = jb6.M0(2131751261, null);
                            } else {
                                M0 = jb6.M0(2131751260, null);
                            }
                            kt6.r(1, M0, arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z) {
                            kt6.r(1, jb6.M0(2131751249, null), arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z) {
                            kt6.r(1, jb6.M0(2131751256, null), arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            if (z) {
                                i = 2131751258;
                            } else {
                                i = 2131751253;
                            }
                            kt6.r(1, jb6.M0(i, null), arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z) {
                            kt6.r(1, jb6.M0(2131751265, null), arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            kt6.r(1, jb6.M0(2131751267, null), arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z) {
                            kt6.r(1, jb6.M0(2131751250, null), arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            kt6.r(1, jb6.M0(2131751268, null), arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z) {
                            kt6.r(1, jb6.M0(2131751240, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            kt6.r(1, jb6.M0(2131744590, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z) {
                            kt6.r(1, jb6.M0(2131748449, null), arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(oa9.a(TextUtils.concat(S22, " ", ((oa9) arrayList2.get(0)).b)));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(S2);
                            valueOf.append((CharSequence) " ");
                            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                if (i3 > 0) {
                                    valueOf.append((CharSequence) ", ");
                                }
                                valueOf.append((CharSequence) ((oa9) arrayList2.get(i3)).b.toString().toLowerCase());
                            }
                            valueOf.append((CharSequence) ".");
                            arrayList.add(oa9.a(valueOf));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                jf5 jf5Var = new jf5(getContext(), 20);
                jf5Var.setText(jb6.M0(2131747069, null));
                int i4 = cmb.c6;
                anb.h(i4, null, jf5Var);
                addView(jf5Var, qoe.o(-1, -2));
                View ak4Var = new ak4(getContext(), 9, (byte) 1);
                ak4Var.setBackground(null);
                anb.h(i4, null, ak4Var);
                addView(ak4Var, qoe.o(-1, -2));
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    oa9 oa9Var = (oa9) obj;
                    Context context = getContext();
                    t1 t1Var = new t1((byte) 8, context, false);
                    anb.h(cmb.c6, null, t1Var);
                    t1Var.setOrientation(0);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    if (oa9Var.a <= 0) {
                        i2 = 2131231627;
                    } else {
                        i2 = 2131231628;
                    }
                    imageView.setImageResource(i2);
                    anb.s(imageView, cmb.K6, null, PorterDuff.Mode.MULTIPLY);
                    t1Var.addView(imageView, qoe.q(20, 20, 0.0f, 51, ((oa9Var.a ? 1 : 0) << 4) + 17, -1, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTextSize(1, 14.0f);
                    anb.X(textView, cmb.y6, null);
                    textView.setSingleLine(false);
                    textView.setText(oa9Var.b);
                    t1Var.addView(textView, qoe.t(-1, -2, 1, 6, 4, 24, 4));
                    addView(t1Var, qoe.o(-1, -2));
                }
                int i6 = cmb.c6;
                View ak4Var2 = new ak4(getContext(), 12, (byte) 1);
                ak4Var2.setBackground(null);
                anb.h(i6, null, ak4Var2);
                addView(ak4Var2, qoe.o(-1, -2));
                Drawable W0 = cmb.W0(getContext(), 2131231234, cmb.a7);
                View ak4Var3 = new ak4(getContext(), 12, (byte) 1);
                ak4Var3.setBackground(W0);
                addView(ak4Var3, qoe.o(-1, -2));
            }
        }
    }
}
