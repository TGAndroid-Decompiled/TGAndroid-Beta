package ng;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import eg.m1;
import fg.e2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.xn;
public final class v extends FrameLayout {
    public final xn f16223a;
    public u f16224b;
    public List f16225c;
    public boolean d;
    public MessageObject f16226e;
    public final int f16227f;
    public final int h;
    public float f16228n;
    public float f16229r;
    public float f16230s;
    public long v;
    public boolean f16231w;
    public boolean f16232x;
    public final int[] f16233y;

    public v(xn xnVar, Context context) {
        super(context);
        this.f16225c = Collections.EMPTY_LIST;
        this.f16227f = 22;
        this.h = 24;
        this.f16233y = new int[2];
        setVisibility(8);
        this.f16223a = xnVar;
        setClipToPadding(false);
        setClipChildren(false);
        xnVar.f43362u0.j(new e2(this, 10));
    }

    public final void a(boolean z4) {
        if (z4) {
            setVisibility(0);
            post(new t(this, 1));
            return;
        }
        this.f16232x = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new m1(this, 18));
        duration.addListener(new dg.l0(this, 13));
        duration.start();
    }

    public final MessageObject b() {
        MessageObject.GroupedMessages y82;
        ArrayList<MessageObject> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (this.d && !this.f16225c.isEmpty()) {
            int i10 = 0;
            MessageObject messageObject = (MessageObject) this.f16225c.get(0);
            if (messageObject.getGroupId() != 0 && (y82 = this.f16223a.y8(messageObject.getGroupId())) != null && (arrayList = y82.messages) != null) {
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

    public final void c(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: ng.v.c(boolean):void");
    }

    public final boolean d() {
        if (this.d && !this.f16231w) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z4) {
        this.f16231w = z4;
        if (z4) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.MessageObject> r11) {
        throw new UnsupportedOperationException("Method not decompiled: ng.v.setSelectedMessages(java.util.List):void");
    }
}
