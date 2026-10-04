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
import e0.p0;
import f0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class c {
    public Context f10137a;
    public String f10138b;
    public Intent[] f10139c;
    public ComponentName d;
    public CharSequence f10140e;
    public CharSequence f10141f;
    public CharSequence f10142g;
    public IconCompat h;
    public p0[] f10143i;
    public Set f10144j;
    public h f10145k;
    public boolean f10146l;
    public int f10147m;
    public PersistableBundle f10148n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f10138b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f10139c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f10137a, this.f10138b).setShortLabel(this.f10140e).setIntents(this.f10139c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f10137a));
        }
        if (!TextUtils.isEmpty(this.f10141f)) {
            intents.setLongLabel(this.f10141f);
        }
        if (!TextUtils.isEmpty(this.f10142g)) {
            intents.setDisabledMessage(this.f10142g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f10144j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f10147m);
        PersistableBundle persistableBundle = this.f10148n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            p0[] p0VarArr = this.f10143i;
            if (p0VarArr != null && p0VarArr.length > 0) {
                int length = p0VarArr.length;
                Person[] personArr = new Person[length];
                while (i10 < length) {
                    p0 p0Var = this.f10143i[i10];
                    p0Var.getClass();
                    personArr[i10] = b5.d.E(p0Var);
                    i10++;
                }
                intents.setPersons(personArr);
            }
            h hVar = this.f10145k;
            if (hVar != null) {
                intents.setLocusId(hVar.f9543b);
            }
            intents.setLongLived(this.f10146l);
        } else {
            if (this.f10148n == null) {
                this.f10148n = new PersistableBundle();
            }
            p0[] p0VarArr2 = this.f10143i;
            if (p0VarArr2 != null && p0VarArr2.length > 0) {
                this.f10148n.putInt("extraPersonCount", p0VarArr2.length);
                while (i10 < this.f10143i.length) {
                    PersistableBundle persistableBundle2 = this.f10148n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i11 = i10 + 1;
                    sb2.append(i11);
                    String sb3 = sb2.toString();
                    p0 p0Var2 = this.f10143i[i10];
                    p0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = p0Var2.f8468a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", p0Var2.f8470c);
                    persistableBundle3.putString("key", p0Var2.d);
                    persistableBundle3.putBoolean("isBot", p0Var2.f8471e);
                    persistableBundle3.putBoolean("isImportant", p0Var2.f8472f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i10 = i11;
                }
            }
            h hVar2 = this.f10145k;
            if (hVar2 != null) {
                this.f10148n.putString("extraLocusId", hVar2.f9542a);
            }
            this.f10148n.putBoolean("extraLongLived", this.f10146l);
            intents.setExtras(this.f10148n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.h(intents);
        }
        return intents.build();
    }
}
