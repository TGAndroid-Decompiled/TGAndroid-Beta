package mi;

import java.util.ArrayList;
public final class z3 {
    public final ArrayList f20086a;

    public z3(ArrayList arrayList) {
        this.f20086a = arrayList;
    }

    public void a(StringBuilder sb2) {
        String str;
        if (((Boolean) org.telegram.ui.Cells.f1.o(1, this.f20086a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb2.append(str);
    }

    public void b(StringBuilder sb2) {
        while (!this.f20086a.isEmpty()) {
            a(sb2);
        }
    }

    public tf.f c(int i3) {
        return (tf.f) this.f20086a.get(i3);
    }

    public z3(tf.f fVar) {
        ArrayList arrayList = new ArrayList(1);
        this.f20086a = arrayList;
        arrayList.add(fVar);
    }

    public z3() {
        this.f20086a = new ArrayList();
    }
}
