package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public final class nqa implements pe3 {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public nqa(char c) {
        this.a = c;
    }

    @Override
    public final void a(qkb qkbVar, qkb qkbVar2, int i) {
        pe3 pe3Var;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                pe3Var = (pe3) it.next();
                if (pe3Var.c() <= i) {
                    break;
                }
            } else {
                pe3Var = (pe3) linkedList.getFirst();
                break;
            }
        }
        pe3Var.a(qkbVar, qkbVar2, i);
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
    public final int d(oe3 oe3Var, oe3 oe3Var2) {
        pe3 pe3Var;
        int i = oe3Var.g;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                pe3Var = (pe3) it.next();
                if (pe3Var.c() <= i) {
                    break;
                }
            } else {
                pe3Var = (pe3) linkedList.getFirst();
                break;
            }
        }
        return pe3Var.d(oe3Var, oe3Var2);
    }

    @Override
    public final char e() {
        return this.a;
    }

    public final void f(pe3 pe3Var) {
        int c = pe3Var.c();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int c2 = ((pe3) listIterator.next()).c();
            if (c > c2) {
                listIterator.previous();
                listIterator.add(pe3Var);
                return;
            } else if (c == c2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + c);
            }
        }
        linkedList.add(pe3Var);
        this.b = c;
    }
}
