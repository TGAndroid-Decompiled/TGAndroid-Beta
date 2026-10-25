package g0;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import e0.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class c {
    public Context f12209a;
    public String f12210b;
    public Intent[] f12211c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f12212f;
    public CharSequence f12213g;
    public IconCompat h;
    public l0[] f12214i;
    public Set f12215j;
    public f0.f f12216k;
    public boolean f12217l;
    public int f12218m;
    public PersistableBundle f12219n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f12210b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f12211c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f12209a, this.f12210b).setShortLabel(this.e).setIntents(this.f12211c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f12209a));
        }
        if (!TextUtils.isEmpty(this.f12212f)) {
            intents.setLongLabel(this.f12212f);
        }
        if (!TextUtils.isEmpty(this.f12213g)) {
            intents.setDisabledMessage(this.f12213g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f12215j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f12218m);
        PersistableBundle persistableBundle = this.f12219n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            l0[] l0VarArr = this.f12214i;
            if (l0VarArr != null && l0VarArr.length > 0) {
                int length = l0VarArr.length;
                Person[] personArr = new Person[length];
                while (i10 < length) {
                    l0 l0Var = this.f12214i[i10];
                    l0Var.getClass();
                    personArr[i10] = c5.d.E(l0Var);
                    i10++;
                }
                intents.setPersons(personArr);
            }
            f0.f fVar = this.f12216k;
            if (fVar != null) {
                intents.setLocusId(fVar.f10051b);
            }
            intents.setLongLived(this.f12217l);
        } else {
            if (this.f12219n == null) {
                this.f12219n = new PersistableBundle();
            }
            l0[] l0VarArr2 = this.f12214i;
            if (l0VarArr2 != null && l0VarArr2.length > 0) {
                this.f12219n.putInt("extraPersonCount", l0VarArr2.length);
                while (i10 < this.f12214i.length) {
                    PersistableBundle persistableBundle2 = this.f12219n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i11 = i10 + 1;
                    sb2.append(i11);
                    String sb3 = sb2.toString();
                    l0 l0Var2 = this.f12214i[i10];
                    l0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = l0Var2.f9565a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", l0Var2.f9567c);
                    persistableBundle3.putString("key", l0Var2.d);
                    persistableBundle3.putBoolean("isBot", l0Var2.e);
                    persistableBundle3.putBoolean("isImportant", l0Var2.f9568f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i10 = i11;
                }
            }
            f0.f fVar2 = this.f12216k;
            if (fVar2 != null) {
                this.f12219n.putString("extraLocusId", fVar2.f10050a);
            }
            this.f12219n.putBoolean("extraLongLived", this.f12217l);
            intents.setExtras(this.f12219n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.f(intents);
        }
        return intents.build();
    }
}
