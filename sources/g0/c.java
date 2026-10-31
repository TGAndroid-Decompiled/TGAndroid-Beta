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
    public Context f7262a;
    public String f7263b;
    public Intent[] f7264c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f7265f;
    public CharSequence f7266g;
    public IconCompat h;
    public l0[] f7267i;
    public Set f7268j;
    public f0.f f7269k;
    public boolean f7270l;
    public int f7271m;
    public PersistableBundle f7272n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f7263b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f7264c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f7262a, this.f7263b).setShortLabel(this.e).setIntents(this.f7264c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f7262a));
        }
        if (!TextUtils.isEmpty(this.f7265f)) {
            intents.setLongLabel(this.f7265f);
        }
        if (!TextUtils.isEmpty(this.f7266g)) {
            intents.setDisabledMessage(this.f7266g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f7268j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f7271m);
        PersistableBundle persistableBundle = this.f7272n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            l0[] l0VarArr = this.f7267i;
            if (l0VarArr != null && l0VarArr.length > 0) {
                int length = l0VarArr.length;
                Person[] personArr = new Person[length];
                while (i10 < length) {
                    l0 l0Var = this.f7267i[i10];
                    l0Var.getClass();
                    personArr[i10] = b5.d.E(l0Var);
                    i10++;
                }
                intents.setPersons(personArr);
            }
            f0.f fVar = this.f7269k;
            if (fVar != null) {
                intents.setLocusId(fVar.f6720b);
            }
            intents.setLongLived(this.f7270l);
        } else {
            if (this.f7272n == null) {
                this.f7272n = new PersistableBundle();
            }
            l0[] l0VarArr2 = this.f7267i;
            if (l0VarArr2 != null && l0VarArr2.length > 0) {
                this.f7272n.putInt("extraPersonCount", l0VarArr2.length);
                while (i10 < this.f7267i.length) {
                    PersistableBundle persistableBundle2 = this.f7272n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i11 = i10 + 1;
                    sb2.append(i11);
                    String sb3 = sb2.toString();
                    l0 l0Var2 = this.f7267i[i10];
                    l0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = l0Var2.f6045a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", l0Var2.f6047c);
                    persistableBundle3.putString("key", l0Var2.d);
                    persistableBundle3.putBoolean("isBot", l0Var2.e);
                    persistableBundle3.putBoolean("isImportant", l0Var2.f6048f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i10 = i11;
                }
            }
            f0.f fVar2 = this.f7269k;
            if (fVar2 != null) {
                this.f7272n.putString("extraLocusId", fVar2.f6719a);
            }
            this.f7272n.putBoolean("extraLongLived", this.f7270l);
            intents.setExtras(this.f7272n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.h(intents);
        }
        return intents.build();
    }
}
