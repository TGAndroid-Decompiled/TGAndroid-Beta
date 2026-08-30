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
import e0.o0;
import f0.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class c {
    public Context f6333a;
    public String f6334b;
    public Intent[] f6335c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f6336f;
    public CharSequence f6337g;
    public IconCompat h;
    public o0[] f6338i;
    public Set f6339j;
    public i f6340k;
    public boolean f6341l;
    public int f6342m;
    public PersistableBundle f6343n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f6334b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f6335c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f6333a, this.f6334b).setShortLabel(this.e).setIntents(this.f6335c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f6333a));
        }
        if (!TextUtils.isEmpty(this.f6336f)) {
            intents.setLongLabel(this.f6336f);
        }
        if (!TextUtils.isEmpty(this.f6337g)) {
            intents.setDisabledMessage(this.f6337g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f6339j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f6342m);
        PersistableBundle persistableBundle = this.f6343n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            o0[] o0VarArr = this.f6338i;
            if (o0VarArr != null && o0VarArr.length > 0) {
                int length = o0VarArr.length;
                Person[] personArr = new Person[length];
                while (i10 < length) {
                    o0 o0Var = this.f6338i[i10];
                    o0Var.getClass();
                    personArr[i10] = d1.f.E(o0Var);
                    i10++;
                }
                intents.setPersons(personArr);
            }
            i iVar = this.f6340k;
            if (iVar != null) {
                intents.setLocusId(iVar.f5647b);
            }
            intents.setLongLived(this.f6341l);
        } else {
            if (this.f6343n == null) {
                this.f6343n = new PersistableBundle();
            }
            o0[] o0VarArr2 = this.f6338i;
            if (o0VarArr2 != null && o0VarArr2.length > 0) {
                this.f6343n.putInt("extraPersonCount", o0VarArr2.length);
                while (i10 < this.f6338i.length) {
                    PersistableBundle persistableBundle2 = this.f6343n;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i11 = i10 + 1;
                    sb.append(i11);
                    String sb2 = sb.toString();
                    o0 o0Var2 = this.f6338i[i10];
                    o0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = o0Var2.f5006a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", o0Var2.f5008c);
                    persistableBundle3.putString("key", o0Var2.d);
                    persistableBundle3.putBoolean("isBot", o0Var2.e);
                    persistableBundle3.putBoolean("isImportant", o0Var2.f5009f);
                    persistableBundle2.putPersistableBundle(sb2, persistableBundle3);
                    i10 = i11;
                }
            }
            i iVar2 = this.f6340k;
            if (iVar2 != null) {
                this.f6343n.putString("extraLocusId", iVar2.f5646a);
            }
            this.f6343n.putBoolean("extraLongLived", this.f6341l);
            intents.setExtras(this.f6343n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.f(intents);
        }
        return intents.build();
    }
}
