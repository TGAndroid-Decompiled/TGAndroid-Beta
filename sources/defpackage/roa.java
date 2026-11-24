package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public final class roa implements hf3 {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public roa(char c) {
        this.a = c;
    }

    @Override
    public final void a(vib vibVar, vib vibVar2, int i) {
        hf3 hf3Var;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                hf3Var = (hf3) it.next();
                if (hf3Var.c() <= i) {
                    break;
                }
            } else {
                hf3Var = (hf3) linkedList.getFirst();
                break;
            }
        }
        hf3Var.a(vibVar, vibVar2, i);
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
    public final int d(gf3 gf3Var, gf3 gf3Var2) {
        hf3 hf3Var;
        int i = gf3Var.g;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                hf3Var = (hf3) it.next();
                if (hf3Var.c() <= i) {
                    break;
                }
            } else {
                hf3Var = (hf3) linkedList.getFirst();
                break;
            }
        }
        return hf3Var.d(gf3Var, gf3Var2);
    }

    @Override
    public final char e() {
        return this.a;
    }

    public final void f(hf3 hf3Var) {
        int c = hf3Var.c();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int c2 = ((hf3) listIterator.next()).c();
            if (c > c2) {
                listIterator.previous();
                listIterator.add(hf3Var);
                return;
            } else if (c == c2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + c);
            }
        }
        linkedList.add(hf3Var);
        this.b = c;
    }
}
