package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.telegram.messenger.a;
import org.telegram.ui.o;
public final class dt3 implements ActionMode.Callback {
    public final byte a;
    public Object b;
    public final Object c;

    public dt3(rib ribVar) {
        this.a = (byte) 1;
        this.c = ribVar;
        this.b = null;
    }

    public final void b(Menu menu) {
        boolean z;
        k96.D0().y.getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        if (((rib) this.c).k0 != null && ((String) this.b) != null && !qa9.b0().contains((String) this.b)) {
            z = true;
        } else {
            z = false;
        }
        findItem.setVisible(z);
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        k27 k27Var;
        CharSequence r;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (((gt3) obj).H(menuItem.getItemId())) {
                    actionMode.finish();
                    return true;
                }
                try {
                    return ((ActionMode.Callback) this.b).onActionItemClicked(actionMode, menuItem);
                } catch (Exception unused) {
                    return true;
                }
            default:
                rib ribVar = (rib) obj;
                kya kyaVar = ribVar.m0;
                if (ribVar.w()) {
                    int itemId = menuItem.getItemId();
                    if (itemId == 16908321) {
                        if (ribVar.w() && ribVar.a()) {
                            if (!ribVar.B()) {
                                CharSequence q = ribVar.q();
                                if (q != null) {
                                    gl.g(q);
                                }
                            }
                            ribVar.t();
                            ribVar.e(true);
                            ive iveVar = ribVar.D;
                            if (iveVar != null) {
                                iveVar.b();
                            }
                        }
                    } else if (itemId == 16908319) {
                        if (!ribVar.I() && (r = ribVar.r(ribVar.W, false)) != null) {
                            ribVar.u = 0;
                            ribVar.v = r.length();
                            ribVar.t();
                            ribVar.v();
                            gl.r(kyaVar);
                            gl.c3(kyaVar);
                        }
                    } else if (itemId == 3) {
                        if (ribVar.k0 != null) {
                            String language = k96.D0().y.getLanguage();
                            ys ysVar = ribVar.k0;
                            CharSequence q2 = ribVar.q();
                            cib cibVar = new cib(this, (byte) 0);
                            o oVar = ysVar.a;
                            rzb.Q0(oVar.M, oVar.N, (String) this.b, language, q2, null, cibVar);
                        }
                        ribVar.t();
                    } else if (itemId == 2131296504) {
                        if (ribVar.w()) {
                            mib mibVar = ribVar.W;
                            if (mibVar instanceof gb2) {
                                k27Var = ((gb2) mibVar).getMessageObject();
                            } else {
                                k27Var = null;
                            }
                            if (k27Var != null && ribVar.q() != null) {
                                ribVar.H(ribVar.u, ribVar.v, k27Var);
                                ribVar.e(true);
                            }
                        }
                        ribVar.t();
                    } else if (itemId == 16908320) {
                        ribVar.C();
                        ribVar.t();
                    } else if (itemId == 16908322) {
                        ribVar.G();
                        ribVar.t();
                    } else {
                        ribVar.e(false);
                    }
                }
                return true;
        }
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                ((gt3) this.c).F();
                return ((ActionMode.Callback) this.b).onCreateActionMode(actionMode, menu);
            default:
                menu.add(0, 16908321, 0, 17039361);
                menu.add(0, 2131296504, 1, k96.M0(2131746247, null));
                menu.add(0, 3, 2, k96.M0(2131743717, null));
                menu.add(0, 16908320, 3, 17039363);
                menu.add(0, 16908322, 4, 17039371);
                menu.add(0, 16908319, 5, 17039373);
                return true;
        }
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.a) {
            case 0:
                ((gt3) this.c).E();
                ((ActionMode.Callback) this.b).onDestroyActionMode(actionMode);
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        boolean z;
        rib ribVar;
        mib mibVar;
        switch (this.a) {
            case 0:
                return ((ActionMode.Callback) this.b).onPrepareActionMode(actionMode, menu);
            default:
                MenuItem findItem = menu.findItem(2131296504);
                if (findItem != null) {
                    findItem.setVisible(((rib) this.c).d());
                }
                MenuItem findItem2 = menu.findItem(16908321);
                if (findItem2 != null) {
                    findItem2.setVisible(((rib) this.c).a());
                }
                MenuItem findItem3 = menu.findItem(16908319);
                if (findItem3 != null && (mibVar = (ribVar = (rib) this.c).W) != null) {
                    CharSequence r = ribVar.r(mibVar, false);
                    if (!((rib) this.c).a()) {
                        findItem3.setVisible(false);
                    } else if (((rib) this.c).i()) {
                        findItem3.setVisible(true);
                    } else {
                        rib ribVar2 = (rib) this.c;
                        if (!ribVar2.Z && (ribVar2.u > 0 || ribVar2.v < r.length() - 1)) {
                            findItem3.setVisible(true);
                        } else {
                            findItem3.setVisible(false);
                        }
                    }
                }
                MenuItem findItem4 = menu.findItem(16908320);
                if (findItem4 != null) {
                    findItem4.setVisible(((rib) this.c) instanceof me9);
                }
                MenuItem findItem5 = menu.findItem(16908322);
                if (findItem5 != null) {
                    rib ribVar3 = (rib) this.c;
                    if (ribVar3 instanceof me9) {
                        try {
                            qib qibVar = ribVar3.C;
                            if (qibVar != null) {
                                context = qibVar.getContext();
                            } else {
                                context = a.b;
                            }
                        } catch (Exception unused) {
                        }
                        if (context != null && (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) != null) {
                            if (clipboardManager.hasPrimaryClip()) {
                                z = true;
                                findItem5.setVisible(z);
                            }
                        }
                    }
                    z = false;
                    findItem5.setVisible(z);
                }
                rib ribVar4 = (rib) this.c;
                if (ribVar4.k0 != null && ribVar4.q() != null) {
                    cme.b(((rib) this.c).q().toString(), new dib(this, menu), new dib(this, menu), false);
                } else {
                    this.b = null;
                    b(menu);
                }
                return true;
        }
    }

    public dt3(gt3 gt3Var, ActionMode.Callback callback) {
        this.a = (byte) 0;
        this.c = gt3Var;
        this.b = callback;
    }

    private final void a(ActionMode actionMode) {
    }
}
