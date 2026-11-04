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
import e0.k0;
import f0.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class c {
    public Context f11781a;
    public String f11782b;
    public Intent[] f11783c;
    public ComponentName d;
    public CharSequence f11784e;
    public CharSequence f11785f;
    public CharSequence f11786g;
    public IconCompat h;
    public k0[] f11787i;
    public Set f11788j;
    public g f11789k;
    public boolean f11790l;
    public int f11791m;
    public PersistableBundle f11792n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f11782b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f11783c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f11781a, this.f11782b).setShortLabel(this.f11784e).setIntents(this.f11783c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f11781a));
        }
        if (!TextUtils.isEmpty(this.f11785f)) {
            intents.setLongLabel(this.f11785f);
        }
        if (!TextUtils.isEmpty(this.f11786g)) {
            intents.setDisabledMessage(this.f11786g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f11788j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f11791m);
        PersistableBundle persistableBundle = this.f11792n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            k0[] k0VarArr = this.f11787i;
            if (k0VarArr != null && k0VarArr.length > 0) {
                int length = k0VarArr.length;
                Person[] personArr = new Person[length];
                while (i3 < length) {
                    k0 k0Var = this.f11787i[i3];
                    k0Var.getClass();
                    personArr[i3] = d1.f.E(k0Var);
                    i3++;
                }
                intents.setPersons(personArr);
            }
            g gVar = this.f11789k;
            if (gVar != null) {
                intents.setLocusId(gVar.f11334b);
            }
            intents.setLongLived(this.f11790l);
        } else {
            if (this.f11792n == null) {
                this.f11792n = new PersistableBundle();
            }
            k0[] k0VarArr2 = this.f11787i;
            if (k0VarArr2 != null && k0VarArr2.length > 0) {
                this.f11792n.putInt("extraPersonCount", k0VarArr2.length);
                while (i3 < this.f11787i.length) {
                    PersistableBundle persistableBundle2 = this.f11792n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i10 = i3 + 1;
                    sb2.append(i10);
                    String sb3 = sb2.toString();
                    k0 k0Var2 = this.f11787i[i3];
                    k0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = k0Var2.f9264a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", k0Var2.f9266c);
                    persistableBundle3.putString("key", k0Var2.d);
                    persistableBundle3.putBoolean("isBot", k0Var2.f9267e);
                    persistableBundle3.putBoolean("isImportant", k0Var2.f9268f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i3 = i10;
                }
            }
            g gVar2 = this.f11789k;
            if (gVar2 != null) {
                this.f11792n.putString("extraLocusId", gVar2.f11333a);
            }
            this.f11792n.putBoolean("extraLongLived", this.f11790l);
            intents.setExtras(this.f11792n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.h(intents);
        }
        return intents.build();
    }
}
