package defpackage;

import java.util.ArrayList;
public final class mi2 {
    public final ArrayList a;

    public mi2(byte b) {
        switch (b) {
            case 2:
                this.a = new ArrayList();
                return;
            default:
                this.a = new ArrayList();
                return;
        }
    }

    public final void a(StringBuilder sb) {
        String str;
        if (((Boolean) td4.m(1, this.a)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb.append(str);
    }

    public final void b(StringBuilder sb) {
        while (!this.a.isEmpty()) {
            a(sb);
        }
    }

    public final li2 c(int i) {
        return (li2) this.a.get(i);
    }

    public final ArrayList d(int i, int i2, int i3, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        int size = arrayList3.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList3.get(i4);
            i4++;
            int[] iArr = (int[]) obj;
            if (!z || iArr[2] != 0) {
                if (i3 != 0) {
                    if (iArr[2] <= i3) {
                        arrayList.add(iArr);
                        arrayList2.remove(iArr);
                    }
                } else if (iArr[0] == i) {
                    if (i2 != 0 && iArr[1] != i2) {
                    }
                    arrayList.add(iArr);
                    arrayList2.remove(iArr);
                }
            }
        }
        return arrayList;
    }

    public mi2(li2 li2Var) {
        ArrayList arrayList = new ArrayList(1);
        this.a = arrayList;
        arrayList.add(li2Var);
    }

    public mi2(ArrayList arrayList) {
        this.a = arrayList;
    }
}
