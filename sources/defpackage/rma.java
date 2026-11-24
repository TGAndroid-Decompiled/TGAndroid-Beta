package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public final class rma implements vd3 {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public rma(char c) {
        this.a = c;
    }

    @Override
    public final void a(ugb ugbVar, ugb ugbVar2, int i) {
        vd3 vd3Var;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                vd3Var = (vd3) it.next();
                if (vd3Var.c() <= i) {
                    break;
                }
            } else {
                vd3Var = (vd3) linkedList.getFirst();
                break;
            }
        }
        vd3Var.a(ugbVar, ugbVar2, i);
    }

    @Override
    public final char b() {
        return this.a;
    }

    @Override
    public final int c() {
        return this.b;
    }

    @Override
    public final int d(ud3 ud3Var, ud3 ud3Var2) {
        vd3 vd3Var;
        int i = ud3Var.g;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                vd3Var = (vd3) it.next();
                if (vd3Var.c() <= i) {
                    break;
                }
            } else {
                vd3Var = (vd3) linkedList.getFirst();
                break;
            }
        }
        return vd3Var.d(ud3Var, ud3Var2);
    }

    @Override
    public final char e() {
        return this.a;
    }

    public final void f(vd3 vd3Var) {
        int c = vd3Var.c();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int c2 = ((vd3) listIterator.next()).c();
            if (c > c2) {
                listIterator.previous();
                listIterator.add(vd3Var);
                return;
            } else if (c == c2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + c);
            }
        }
        linkedList.add(vd3Var);
        this.b = c;
    }
}
