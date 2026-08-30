package mg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import dg.o1;
import eg.f2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.xn;
public final class v extends FrameLayout {
    public final xn f14150a;
    public u f14151b;
    public List f14152c;
    public boolean d;
    public MessageObject e;
    public final int f14153f;
    public final int h;
    public float f14154n;
    public float f14155r;
    public float f14156s;
    public long v;
    public boolean f14157w;
    public boolean f14158x;
    public final int[] f14159y;

    public v(xn xnVar, Context context) {
        super(context);
        this.f14152c = Collections.EMPTY_LIST;
        this.f14153f = 22;
        this.h = 24;
        this.f14159y = new int[2];
        setVisibility(8);
        this.f14150a = xnVar;
        setClipToPadding(false);
        setClipChildren(false);
        xnVar.f40193u0.j(new f2(this, 10));
    }

    public final void a(boolean z4) {
        if (z4) {
            setVisibility(0);
            post(new t(this, 1));
            return;
        }
        this.f14158x = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new o1(this, 18));
        duration.addListener(new cg.l0(this, 13));
        duration.start();
    }

    public final MessageObject b() {
        MessageObject.GroupedMessages y82;
        ArrayList<MessageObject> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (this.d && !this.f14152c.isEmpty()) {
            int i10 = 0;
            MessageObject messageObject = (MessageObject) this.f14152c.get(0);
            if (messageObject.getGroupId() != 0 && (y82 = this.f14150a.y8(messageObject.getGroupId())) != null && (arrayList = y82.messages) != null) {
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
        throw new UnsupportedOperationException("Method not decompiled: mg.v.c(boolean):void");
    }

    public final boolean d() {
        if (this.d && !this.f14157w) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z4) {
        this.f14157w = z4;
        if (z4) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.MessageObject> r11) {
        throw new UnsupportedOperationException("Method not decompiled: mg.v.setSelectedMessages(java.util.List):void");
    }
}
