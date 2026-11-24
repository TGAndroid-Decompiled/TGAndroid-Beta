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
public final class l89 extends LinearLayout {
    public static final int c = 0;
    public TLRPC.RequestPeerType a;
    public ArrayList b;

    public final void a(Boolean bool, int i, int i2) {
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            ArrayList arrayList = this.b;
            if (booleanValue) {
                arrayList.add(m89.a(gl.T2(k96.M0(i, null))));
            } else {
                arrayList.add(m89.a(gl.T2(k96.M0(i2, null))));
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
                a(((TLRPC.TL_requestPeerTypeUser) requestPeerType).premium, 2131747146, 2131747147);
            } else {
                boolean z = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
                if (z) {
                    a(requestPeerType.has_username, 2131747154, 2131747155);
                    Boolean bool = requestPeerType.bot_participant;
                    if (bool != null && bool.booleanValue()) {
                        arrayList.add(m89.a(gl.T2(k96.M0(2131747157, null))));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(m89.a(gl.T2(k96.M0(2131747156, null))));
                    }
                } else {
                    a(requestPeerType.has_username, 2131747148, 2131747149);
                    a(requestPeerType.forum, 2131747152, 2131747153);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(m89.a(gl.T2(k96.M0(2131747151, null))));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(m89.a(gl.T2(k96.M0(2131747150, null))));
                    }
                }
                Boolean bool5 = requestPeerType.creator;
                if (bool5 == null || !bool5.booleanValue()) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.user_admin_rights;
                    SpannableStringBuilder T2 = gl.T2(k96.M0(2131747144, null));
                    SpannableStringBuilder T22 = gl.T2(k96.M0(2131747145, null));
                    if (tL_chatAdminRights != null) {
                        ArrayList arrayList2 = new ArrayList();
                        if (tL_chatAdminRights.change_info) {
                            if (z) {
                                M0 = k96.M0(2131751312, null);
                            } else {
                                M0 = k96.M0(2131751311, null);
                            }
                            ls6.q(1, M0, arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z) {
                            ls6.q(1, k96.M0(2131751300, null), arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z) {
                            ls6.q(1, k96.M0(2131751307, null), arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            if (z) {
                                i = 2131751309;
                            } else {
                                i = 2131751304;
                            }
                            ls6.q(1, k96.M0(i, null), arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z) {
                            ls6.q(1, k96.M0(2131751316, null), arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            ls6.q(1, k96.M0(2131751318, null), arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z) {
                            ls6.q(1, k96.M0(2131751301, null), arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            ls6.q(1, k96.M0(2131751319, null), arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z) {
                            ls6.q(1, k96.M0(2131751291, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            ls6.q(1, k96.M0(2131744664, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z) {
                            ls6.q(1, k96.M0(2131748500, null), arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(m89.a(TextUtils.concat(T22, " ", ((m89) arrayList2.get(0)).b)));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(T2);
                            valueOf.append((CharSequence) " ");
                            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                if (i3 > 0) {
                                    valueOf.append((CharSequence) ", ");
                                }
                                valueOf.append((CharSequence) ((m89) arrayList2.get(i3)).b.toString().toLowerCase());
                            }
                            valueOf.append((CharSequence) ".");
                            arrayList.add(m89.a(valueOf));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                ld5 ld5Var = new ld5(getContext(), 20);
                ld5Var.setText(k96.M0(2131747143, null));
                int i4 = bkb.c6;
                zkb.h(i4, null, ld5Var);
                addView(ld5Var, nme.o(-1, -2));
                View wh4Var = new wh4(getContext(), 9, (byte) 1);
                wh4Var.setBackground(null);
                zkb.h(i4, null, wh4Var);
                addView(wh4Var, nme.o(-1, -2));
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    m89 m89Var = (m89) obj;
                    Context context = getContext();
                    t1 t1Var = new t1((byte) 8, context, false);
                    zkb.h(bkb.c6, null, t1Var);
                    t1Var.setOrientation(0);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    if (m89Var.a <= 0) {
                        i2 = 2131231626;
                    } else {
                        i2 = 2131231627;
                    }
                    imageView.setImageResource(i2);
                    zkb.s(imageView, bkb.K6, null, PorterDuff.Mode.MULTIPLY);
                    t1Var.addView(imageView, nme.q(20, 20, 0.0f, 51, ((m89Var.a ? 1 : 0) << 4) + 17, -1, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTextSize(1, 14.0f);
                    zkb.X(textView, bkb.y6, null);
                    textView.setSingleLine(false);
                    textView.setText(m89Var.b);
                    t1Var.addView(textView, nme.t(-1, -2, 1, 6, 4, 24, 4));
                    addView(t1Var, nme.o(-1, -2));
                }
                int i6 = bkb.c6;
                View wh4Var2 = new wh4(getContext(), 12, (byte) 1);
                wh4Var2.setBackground(null);
                zkb.h(i6, null, wh4Var2);
                addView(wh4Var2, nme.o(-1, -2));
                Drawable W0 = bkb.W0(getContext(), 2131231233, bkb.a7);
                View wh4Var3 = new wh4(getContext(), 12, (byte) 1);
                wh4Var3.setBackground(W0);
                addView(wh4Var3, nme.o(-1, -2));
            }
        }
    }
}
