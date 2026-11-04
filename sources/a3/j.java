package a3;

import ai.h6;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b8.ke;
import ci.d9;
import ci.l6;
import ci.tb;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.e9;
import org.telegram.messenger.t10;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.et0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.ra1;
public final class j implements g2.k, p1, t10, e9, f9.k, t9.d, Vector.TLDeserializer, o6, p6, et0 {
    public final int f94a;

    public j(int i3) {
        this.f94a = i3;
    }

    @Override
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        switch (this.f94a) {
            case 3:
                return Boolean.FALSE;
            default:
                return Boolean.FALSE;
        }
    }

    @Override
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override
    public java.lang.Object apply(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: a3.j.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i3, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i3, z10);
    }

    @Override
    public void f(int i3, View view) {
        ((d9) view).setColor(i3);
    }

    @Override
    public void g(s1 s1Var, int i3) {
        switch (this.f94a) {
            case 1:
                s1Var.dismiss();
                return;
            case 2:
                s1Var.dismiss();
                return;
            case 18:
                int i10 = l6.f5445t3;
                return;
            default:
                l6.c2(new ra1(6, null));
                return;
        }
    }

    @Override
    public int h(View view) {
        return ((d9) view).f4986y;
    }

    @Override
    public float i(RecyclerView recyclerView) {
        return f1.c(recyclerView);
    }

    @Override
    public Object k(Object obj) {
        Integer num = (Integer) obj;
        int i3 = h6.f682d2;
        return 0;
    }

    @Override
    public RecyclerView m(View view) {
        return ((tb) view).f6049a;
    }

    @Override
    public Object q1(ke keVar) {
        Set I = keVar.I(bb.a.class);
        bb.c cVar = bb.c.f3209c;
        if (cVar == null) {
            synchronized (bb.c.class) {
                try {
                    cVar = bb.c.f3209c;
                    if (cVar == null) {
                        cVar = new bb.c(0);
                        bb.c.f3209c = cVar;
                    }
                } finally {
                }
            }
        }
        return new bb.b(I, cVar);
    }

    @Override
    public void r(RecyclerView recyclerView) {
        f1.b(recyclerView);
    }

    public j(Object obj, int i3) {
        this.f94a = i3;
    }
}
