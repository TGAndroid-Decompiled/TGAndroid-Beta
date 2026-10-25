package bh;

import a8.ee;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ds;
import org.telegram.ui.bk;
import org.telegram.ui.oj;
import org.telegram.ui.un;
public final class x extends FrameLayout {
    public final un f4195a;
    public w f4196b;
    public List f4197c;
    public boolean d;
    public MessageObject e;
    public final int f4198f;
    public final int h;
    public float f4199n;
    public float f4200r;
    public float f4201s;
    public long v;
    public boolean f4202w;
    public boolean f4203x;
    public final int[] f4204y;

    public x(un unVar, Context context) {
        super(context);
        this.f4197c = Collections.EMPTY_LIST;
        this.f4198f = 22;
        this.h = 24;
        this.f4204y = new int[2];
        setVisibility(8);
        this.f4195a = unVar;
        setClipToPadding(false);
        setClipChildren(false);
        unVar.f44468x0.j(new ai.b(this, 2));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new v(this, 1));
            return;
        }
        this.f4203x = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new ai.g0(this, 2));
        duration.addListener(new b(this, 2));
        duration.start();
    }

    public final MessageObject b() {
        MessageObject.GroupedMessages H8;
        ArrayList<MessageObject> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (this.d && !this.f4197c.isEmpty()) {
            int i10 = 0;
            MessageObject messageObject = (MessageObject) this.f4197c.get(0);
            if (messageObject.getGroupId() != 0 && (H8 = this.f4195a.H8(messageObject.getGroupId())) != null && (arrayList = H8.messages) != null) {
                int size = arrayList.size();
                while (i10 < size) {
                    MessageObject messageObject2 = arrayList.get(i10);
                    i10++;
                    MessageObject messageObject3 = messageObject2;
                    TLRPC.Message message = messageObject3.messageOwner;
                    if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList2 = tL_messageReactions.results) != null && !arrayList2.isEmpty()) {
                        return messageObject3;
                    }
                }
            }
            return messageObject;
        }
        return null;
    }

    public final void c(boolean z10) {
        int height;
        int height2;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        if (this.d && this.e != null && this.f4196b != null) {
            long min = Math.min(16L, System.currentTimeMillis() - this.v);
            this.v = System.currentTimeMillis();
            float f7 = this.f4199n;
            float f10 = this.f4200r;
            if (f7 != f10) {
                float f11 = ((float) min) / 220.0f;
                if (f10 > f7) {
                    this.f4199n = Math.min(f7 + f11, f10);
                } else if (f10 < f7) {
                    this.f4199n = Math.max(f7 - f11, f10);
                }
                AndroidUtilities.runOnUIThread(new v(this, 0));
            }
            un unVar = this.f4195a;
            oj ojVar = unVar.f44468x0;
            int[] iArr = this.f4204y;
            ojVar.getLocationInWindow(iArr);
            boolean z13 = true;
            getLocationInWindow(iArr);
            float f12 = (iArr[1] - iArr[1]) - unVar.Z9;
            boolean z14 = false;
            for (int i12 = 0; i12 < ojVar.getChildCount(); i12++) {
                View childAt = ojVar.getChildAt(i12);
                if (childAt instanceof s1) {
                    s1 s1Var = (s1) childAt;
                    MessageObject messageObject = s1Var.getMessageObject();
                    if (messageObject.getId() == this.e.getId()) {
                        boolean isOutOwner = messageObject.isOutOwner();
                        w wVar = this.f4196b;
                        if (wVar != null) {
                            wVar.setMirrorX(isOutOwner);
                            w wVar2 = this.f4196b;
                            int dp = AndroidUtilities.dp(4.0f);
                            boolean z15 = LocaleController.isRTL;
                            int i13 = this.h;
                            if (!z15 && !isOutOwner) {
                                i11 = i13;
                            } else {
                                i11 = 0;
                            }
                            int i14 = dp + i11;
                            float f13 = this.f4198f;
                            int dp2 = AndroidUtilities.dp(f13);
                            int dp3 = AndroidUtilities.dp(4.0f);
                            if (!LocaleController.isRTL && !isOutOwner) {
                                i13 = 0;
                            }
                            wVar2.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(f13));
                        }
                        if (getHeight() != 0) {
                            height = getHeight();
                        } else {
                            height = ojVar.getHeight();
                        }
                        if (s1Var.getCurrentMessagesGroup() != null) {
                            MessageObject.GroupedMessages.TransitionParams transitionParams = s1Var.getCurrentMessagesGroup().transitionParams;
                            height2 = transitionParams.bottom - transitionParams.top;
                        } else {
                            height2 = s1Var.getHeight();
                        }
                        float y3 = (s1Var.getY() + f12) - AndroidUtilities.dp(74.0f);
                        float dp4 = AndroidUtilities.dp(14.0f);
                        float dp5 = height - AndroidUtilities.dp(218.0f);
                        bk bkVar = unVar.f44293j2;
                        if (bkVar != null && bkVar.getVisibility() == 0) {
                            dp4 += bkVar.getHeight();
                        }
                        float f14 = height2;
                        if (y3 > dp4 - (f14 / 2.0f) && y3 < dp5) {
                            this.f4200r = 0.0f;
                            z11 = false;
                            z12 = true;
                        } else {
                            if (y3 >= (dp4 - f14) - AndroidUtilities.dp(92.0f) && y3 <= dp5) {
                                this.f4201s = AndroidUtilities.dp(56.0f) + height2;
                                this.f4200r = 1.0f;
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z12 = z11;
                        }
                        if (!z10) {
                            this.f4199n = this.f4200r;
                        }
                        float interpolation = (ds.f27584f.getInterpolation(this.f4199n) * this.f4201s) + y3;
                        w wVar3 = this.f4196b;
                        if (wVar3 != null) {
                            if (z11 != wVar3.N) {
                                wVar3.setFlippedVertically(z11);
                                AndroidUtilities.runOnUIThread(new v(this, 0));
                            }
                            if (z12 != this.f4196b.isEnabled()) {
                                this.f4196b.setEnabled(z12);
                                this.f4196b.invalidate();
                                if (z12) {
                                    this.f4196b.setVisibility(0);
                                    if (!this.f4203x) {
                                        this.f4203x = true;
                                        this.f4196b.p(this.e, unVar.f44322l8, true);
                                    }
                                }
                            }
                            this.f4196b.setTranslationY(ee.a(interpolation, dp4, dp5));
                            this.f4196b.setTranslationX(s1Var.E2(true));
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f4196b.getLayoutParams();
                            int c10 = org.telegram.messenger.t.c(32.0f, s1Var.getBackgroundDrawableLeft(), 0);
                            int c11 = org.telegram.messenger.t.c(32.0f, s1Var.getWidth() - s1Var.getBackgroundDrawableRight(), (int) s1Var.E2(true));
                            int dp6 = AndroidUtilities.dp(40.0f) * 8;
                            if ((getWidth() - c11) - c10 < dp6) {
                                if (isOutOwner) {
                                    c10 = Math.min(c10, getWidth() - dp6);
                                    c11 = 0;
                                } else {
                                    c11 = Math.min(c11, getWidth() - dp6);
                                    c10 = 0;
                                }
                            }
                            if (isOutOwner) {
                                i10 = 5;
                            } else {
                                i10 = 3;
                            }
                            if (i10 != layoutParams.gravity) {
                                layoutParams.gravity = i10;
                                z14 = true;
                            }
                            if (c10 != layoutParams.leftMargin) {
                                layoutParams.leftMargin = c10;
                                z14 = true;
                            }
                            if (c11 != layoutParams.rightMargin) {
                                layoutParams.rightMargin = c11;
                            } else {
                                z13 = z14;
                            }
                            if (z13) {
                                this.f4196b.requestLayout();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            w wVar4 = this.f4196b;
            if (wVar4 != null && wVar4.isEnabled()) {
                this.f4196b.setEnabled(false);
            }
        }
    }

    public final boolean d() {
        if (this.d && !this.f4202w) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f4202w = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.MessageObject> r10) {
        throw new UnsupportedOperationException("Method not decompiled: bh.x.setSelectedMessages(java.util.List):void");
    }
}
