package hg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import bg.o2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qn;
public final class v extends FrameLayout {
    public final qn f10761a;
    public u f10762b;
    public List f10763c;
    public boolean d;
    public MessageObject f10764e;
    public final int f10765f;
    public final int h;
    public float f10766n;
    public float f10767r;
    public float f10768s;
    public long v;
    public boolean f10769w;
    public boolean f10770x;
    public final int[] f10771y;

    public v(qn qnVar, Context context) {
        super(context);
        this.f10763c = Collections.EMPTY_LIST;
        this.f10765f = 22;
        this.h = 24;
        this.f10771y = new int[2];
        setVisibility(8);
        this.f10761a = qnVar;
        setClipToPadding(false);
        setClipChildren(false);
        qnVar.f42077t0.j(new o2(this, 9));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new t(this, 1));
            return;
        }
        this.f10770x = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new bg.b(this, 9));
        duration.addListener(new ag.e(this, 7));
        duration.start();
    }

    public final MessageObject b() {
        MessageObject.GroupedMessages y82;
        ArrayList<MessageObject> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (this.d && !this.f10763c.isEmpty()) {
            int i9 = 0;
            MessageObject messageObject = (MessageObject) this.f10763c.get(0);
            if (messageObject.getGroupId() != 0 && (y82 = this.f10761a.y8(messageObject.getGroupId())) != null && (arrayList = y82.messages) != null) {
                int size = arrayList.size();
                while (i9 < size) {
                    MessageObject messageObject2 = arrayList.get(i9);
                    i9++;
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
        throw new UnsupportedOperationException("Method not decompiled: hg.v.c(boolean):void");
    }

    public final boolean d() {
        if (this.d && !this.f10769w) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f10769w = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.MessageObject> r11) {
        throw new UnsupportedOperationException("Method not decompiled: hg.v.setSelectedMessages(java.util.List):void");
    }
}
